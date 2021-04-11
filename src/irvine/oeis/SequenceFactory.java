package irvine.oeis;

import java.io.BufferedOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

import org.apfloat.ApfloatRuntimeException;

import irvine.math.z.Z;

/**
 * A factory providing methods to get an object capable to generating a
 * specified sequence in the OEIS.
 * @author Sean A. Irvine
 */
public final class SequenceFactory {

  private SequenceFactory() { }

  /**
   * Return the sequence for the specified id. The sequence is not
   * known then <code>UnsupportedOperationException</code> is thrown.
   *
   * @param seqId sequence identifier in the form <code>A000001</code>
   * @return sequence for id
   * @exception UnsupportedOperationException for an unknown
   * <code>seqId</code>.
   */
  public static Sequence sequence(final String seqId) {
    if (seqId != null && seqId.length() > 1 && seqId.charAt(0) == 'A') {
      final String canonicalId;
      if (seqId.length() < 7) {
        // Pad out number to correct format
        canonicalId = "A000000".substring(0, 8 - seqId.length()) + seqId.substring(1);
      } else {
        canonicalId = seqId;
      }
      try {
        return (Sequence) Class.forName("irvine.oeis.a" + canonicalId.substring(1, 4) + '.' + canonicalId).newInstance();
      } catch (final ClassNotFoundException | IllegalAccessException | InstantiationException e) {
        throw new UnsupportedOperationException("Sequence not found", e);
      }
    }
    throw new UnsupportedOperationException("Unknown sequence number");
  }

  /**
   * Generate terms from specified sequence, writing one term per line.
   * @param args sequence identifier
   * @throws IOException if an I/O error occurs.
   */
  public static void main(final String[] args) throws IOException {
    if (args == null || args.length != 1) {
      System.err.println("Usage: SequenceFactory sequence-id");
      return;
    }
    boolean generated = false;
    try (final OutputStream out = new BufferedOutputStream(new FileOutputStream(FileDescriptor.out))) {
      final byte[] ls = System.lineSeparator().getBytes(StandardCharsets.US_ASCII);
      final Sequence seq = sequence(args[0]);
      try {
        Z z;
        while ((z = seq.next()) != null) {
          generated = true;
          out.write(z.toString().getBytes(StandardCharsets.US_ASCII));
          out.write(ls);
          out.flush();
        }
      } catch (final UnsupportedOperationException e) {
        if (seq instanceof DeadSequence) {
          System.err.println("Sequence is \"dead\" in the OEIS.");
          return;
        }
        throw e;
      }
    } catch (final ApfloatRuntimeException e) {
      // Catch nasty shutdown exception from Apfloat and just ignore it
      if (!"Shutdown in progress".equals(e.getMessage())) {
        throw e;
      }
    } catch (final IOException e) {
      // Ignore broken pipe error so we don't die on | head etc.
      if (!e.getMessage().contains("Broken pipe")) {
        throw e;
      }
    } catch (final UnsupportedOperationException e) {
      if (generated) {
        System.err.println("Implementation limits exceeded, cannot generate further terms for " + args[0] + "\n" + e.getMessage());
      } else {
        System.err.println("Sorry " + args[0] + " is not yet implemented");
      }
    } catch (final UnimplementedException e) {
      System.err.println("Sorry " + args[0] + " is not yet implemented");
    }
  }
}

