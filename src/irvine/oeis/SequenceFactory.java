package irvine.oeis;

import java.io.BufferedOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

import org.apfloat.ApfloatRuntimeException;

import irvine.math.z.Z;
import irvine.util.string.Casing;
import irvine.util.string.StringUtils;

/**
 * A factory providing methods to get an object capable to generating a
 * specified sequence in the OEIS.
 * @author Sean A. Irvine
 */
public final class SequenceFactory {

  private SequenceFactory() { }
  private static Set<String> sDead = null;
  private static final Sequence DEAD_SEQUENCE = new DeadSequence();

  private static synchronized boolean isDead(final String aNumber) {
    if (sDead == null) {
      try {
        sDead = new HashSet<>(StringUtils.suckInWords(SequenceFactory.class.getResourceAsStream("/irvine/oeis/dead.lst"), Casing.NONE));
      } catch (final IOException e) {
        throw new RuntimeException(e);
      }
    }
    return sDead.contains(aNumber);
  }

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
        if (isDead(canonicalId)) {
          return DEAD_SEQUENCE;
        }
        throw new UnsupportedOperationException();
      }
    }
    throw new UnsupportedOperationException();
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
      Z z;
      while ((z = seq.next()) != null) {
        generated = true;
        out.write(z.toString().getBytes(StandardCharsets.US_ASCII));
        out.write(ls);
        out.flush();
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
        System.err.println("Implementation limits exceeded, cannot generate further terms for " + args[0]);
      } else {
        System.err.println("Sorry " + args[0] + " is not yet implemented");
      }
    }
  }
}

