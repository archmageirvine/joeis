package irvine.oeis;

import java.io.BufferedOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;

import org.apfloat.ApfloatRuntimeException;

import irvine.math.z.Z;
import irvine.util.CliFlags;
import irvine.util.string.Date;

/**
 * A factory providing methods to get an object capable to generating a
 * specified sequence in the OEIS.
 * @author Sean A. Irvine
 */
public final class SequenceFactory {

  private SequenceFactory() { }

  private static final byte[] LS = System.lineSeparator().getBytes(StandardCharsets.US_ASCII);
  private static final byte[] SPACE = " ".getBytes(StandardCharsets.US_ASCII);
  private static final byte[] COMMA = ",".getBytes(StandardCharsets.US_ASCII);
  private static final byte[] SEMICOLON = ";".getBytes(StandardCharsets.US_ASCII);
  private static final byte[] LEFT_BRACKET = "[".getBytes(StandardCharsets.US_ASCII);
  private static final byte[] RIGHT_BRACKET = "]".getBytes(StandardCharsets.US_ASCII);
  private static final byte[] ELLIPSIS = "...".getBytes(StandardCharsets.US_ASCII);
  private static final int DEFAULT_DATA_LENGTH = 260;

  // Long for command line options
  private static final String B_FILE = "b-file";
  private static final String DATA = "data";
  private static final String DATA_LENGTH = "data-length";
  private static final String HEADER = "header";
  private static final String OFFSET = "offset";
  private static final String ROW_NUMBERS = "row-numbers";
  private static final String ROWS = "rows";
  private static final String TERMS = "terms";
  private static final String TIMESTAMP = "timestamp";
  private static final String TRIANGLE = "triangle";

  /**
   * Convert a sequence identifier to a padded out A-number.
   * @param seqId sequence identifier
   * @return canonical name
   */
  public static String getCanonicalId(String seqId) {
    if (seqId != null && seqId.length() > 1) {
      if (!seqId.startsWith("A")) {
        seqId = "A" + seqId;
      }
      final String canonicalId;
      if (seqId.length() < 7) {
        // Pad out number to correct format
        canonicalId = "A000000".substring(0, 8 - seqId.length()) + seqId.substring(1);
      } else {
        canonicalId = seqId;
      }
      return canonicalId;
    }
    throw new UnsupportedOperationException("Unknown sequence number");
  }

  /**
   * Return the sequence for the specified A-number. The sequence is not
   * known then <code>UnsupportedOperationException</code> is thrown.
   *
   * @param seqId A-number identifier in the form <code>A000001</code>
   * @return sequence for id
   * @exception UnsupportedOperationException for an unknown
   * <code>seqId</code>.
   */
  public static Sequence sequence(final String seqId) {
    try {
      return (Sequence) Class.forName("irvine.oeis.a" + seqId.substring(1, 4) + '.' + seqId).getDeclaredConstructor().newInstance();
    } catch (final ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
      throw new UnsupportedOperationException("Sequence not found", e);
    }
  }

  private static boolean dataLineOutputMode(final CliFlags flags, final OutputStream out, final Sequence seq) throws IOException {
    final int maxDataLength = (Integer) flags.getValue(DATA_LENGTH);
    final long numberOfTerms = (Long) flags.getValue(TERMS);
    Z z;
    long termCnt = 0;
    int outputSoFar = 0;
    while (++termCnt <= numberOfTerms && (z = seq.next()) != null) {
      final String sz = z.toString();
      if (outputSoFar + sz.length() + 2 > maxDataLength) {
        break; // no more terms will fit
      }
      if (outputSoFar > 0) {
        out.write(COMMA);
        out.write(SPACE);
        outputSoFar += 2;
      }
      out.write(sz.getBytes(StandardCharsets.US_ASCII));
      out.flush();
      outputSoFar += sz.length();
    }
    out.write(LS);
    return outputSoFar > 0;
  }

  private static long getEffectiveMax(final CliFlags flags, final String option) {
    final long numberOfTerms = (Long) flags.getValue(option);
    return numberOfTerms == 0 ? Long.MAX_VALUE : numberOfTerms;
  }

  private static boolean triangleOutputMode(final CliFlags flags, final OutputStream out, final Sequence seq) throws IOException {
    final boolean timestamp = flags.isSet(TIMESTAMP);
    final boolean rowNumbers = flags.isSet(ROW_NUMBERS);
    final long offset = (Long) flags.getValue(OFFSET);
    final long numberOfTerms = getEffectiveMax(flags, TERMS);
    final long maxRow = getEffectiveMax(flags, ROWS);
    Z z;
    long termCnt = 0;
    int rowCount = 0;
    int rowLimit = 1;
    while (++termCnt <= numberOfTerms && rowLimit <= maxRow && (z = seq.next()) != null) {
      if (rowCount == 0) {
        if (timestamp) {
          out.write(Date.now().getBytes(StandardCharsets.US_ASCII));
        }
        if (rowNumbers) {
          out.write(LEFT_BRACKET);
          out.write(String.valueOf(rowLimit + offset - 1).getBytes(StandardCharsets.US_ASCII));
          out.write(RIGHT_BRACKET);
          out.write(SPACE);
        }
      } else {
        out.write(COMMA);
        out.write(SPACE);
      }
      out.write(z.toString().getBytes(StandardCharsets.US_ASCII));
      if (++rowCount == rowLimit) {
        ++rowLimit;
        rowCount = 0;
        out.write(SEMICOLON);
        out.write(LS);
      }
      out.flush();
    }
    // Deal with the situation where the last row was incomplete
    if (rowCount != 0) {
      out.write(COMMA);
      out.write(SPACE);
      out.write(ELLIPSIS);
      out.write(LS);
      out.flush();
    }
    return rowCount > 0 || rowLimit > 0;
  }

  private static final String[][] INCOMPATIBLE_OPTIONS = {
    {B_FILE, TIMESTAMP},
    {B_FILE, DATA},
    {B_FILE, TRIANGLE},
    {DATA, HEADER},
    {DATA, TIMESTAMP},
    {DATA, TRIANGLE},
  };

  private static String getOptionString(final CliFlags.Flag<?> flag) {
    final Character shortName = flag.getChar();
    final StringBuilder sb = new StringBuilder("--");
    sb.append(flag.getName());
    if (shortName != null) {
      sb.append(" (-").append(shortName).append(')');
    }
    return sb.toString();
  }

  private static final CliFlags.Validator VALIDATOR = flags -> {
    final StringBuilder parseMessage = new StringBuilder();
    for (final String[] pair : INCOMPATIBLE_OPTIONS) {
      if (flags.isSet(pair[0]) && flags.isSet(pair[1])) {
        if (parseMessage.length() > 0) {
          parseMessage.append(' ');
        }
        parseMessage.append("Setting --").append(getOptionString(flags.getFlag(pair[0])));
        parseMessage.append(" incompatible with --").append(getOptionString(flags.getFlag(pair[1])));
        parseMessage.append('.');
      }
    }
    if (parseMessage.length() > 0) {
      flags.setParseMessage(parseMessage.toString());
      return false;
    }
    final int dl = (Integer) flags.getValue(DATA_LENGTH);
    if (dl < 1) {
      flags.setParseMessage("--" + DATA_LENGTH + " must be positive");
    }
    final long n = (Long) flags.getValue(TERMS);
    if (n < 0) {
      flags.setParseMessage("--" + TERMS + " must be non-negative");
    }
    return true;
  };

  /**
   * Generate terms from specified sequence, writing one term per line.
   * @param args sequence identifier
   * @throws IOException if an I/O error occurs.
   */
  public static void main(final String[] args) throws IOException {
    final CliFlags flags = new CliFlags("SequenceFactory", "Generate terms for an OEIS sequence.");
    flags.registerOptional('B', B_FILE, "Output in b-file format");
    flags.registerOptional('D', DATA, "Output in a format suitable for pasting into a DATA line");
    flags.registerOptional('T', TRIANGLE, "Output data as a triangle");
    flags.registerOptional('n', TERMS, Long.class, "number", "Maximum number of terms to generate (or 0 for unnounded)", 0L);
    flags.registerOptional('r', ROWS, Long.class, "number", "Maximum number of rows to generate in a triangle (or 0 for unbounded)", 0L);
    flags.registerOptional('o', OFFSET, Long.class, "number", "Offset to use (relevant for -B and -T with --" + ROW_NUMBERS + ")", 1L);
    flags.registerOptional('t', TIMESTAMP, "Add a timestamp to each line of output");
    flags.registerOptional(DATA_LENGTH, Integer.class, "number", "Maximum total length of output line in characters (in conjunction with -d)", DEFAULT_DATA_LENGTH);
    flags.registerOptional(HEADER, "Print a header");
    flags.registerOptional(ROW_NUMBERS, "Include row numbers in triangle (-T) output");
    flags.registerRequired(String.class, "A-number", "Sequence to generate");
    flags.setValidator(VALIDATOR);
    flags.setFlags(args);
    final boolean timestamp = flags.isSet(TIMESTAMP);
    final boolean bfile = flags.isSet(B_FILE);
    final boolean header = flags.isSet(HEADER);
    final long offset = (Long) flags.getValue(OFFSET);
    final String seqId = getCanonicalId(flags.getAnonymousValue(0).toString());
    boolean generated = false;
    // We use our own version of output stream here, so that we can better detect closed pipes
    // Does what it can to ensure terms are flushed to output as soon as possible
    try (final OutputStream out = new BufferedOutputStream(new FileOutputStream(FileDescriptor.out))) {
      final Sequence seq = sequence(seqId);
      try {
        if (header) {
          final String headerLine = "# " + Date.now() + " jOEIS: " + seqId;
          out.write(headerLine.getBytes(StandardCharsets.US_ASCII));
          out.write(LS);
          out.flush();
        }
        if (flags.isSet(DATA)) {
          generated = dataLineOutputMode(flags, out, seq);
        } else if (flags.isSet(TRIANGLE)) {
          generated = triangleOutputMode(flags, out, seq);
        } else {
          final long numberOfTerms = getEffectiveMax(flags, TERMS);
          Z z;
          long termCnt = 0;
          while (++termCnt <= numberOfTerms && (z = seq.next()) != null) {
            generated = true;
            if (timestamp) {
              out.write(Date.now().getBytes(StandardCharsets.US_ASCII));
            } else if (bfile) {
              out.write(String.valueOf(termCnt + offset - 1).getBytes(StandardCharsets.US_ASCII));
              out.write(SPACE);
            }
            out.write(z.toString().getBytes(StandardCharsets.US_ASCII));
            out.write(LS);
            out.flush();
          }
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
      // Ignore broken pipe error so that we don't die on | head etc.
      if (!e.getMessage().contains("Broken pipe")) {
        throw e;
      }
    } catch (final UnsupportedOperationException e) {
      if (generated) {
        System.err.println("Implementation limits exceeded, cannot generate further terms for " + seqId + "\n" + e.getMessage());
      } else {
        System.err.println("Sorry " + seqId + " is not yet implemented");
      }
    } catch (final UnimplementedException e) {
      System.err.println("Sorry " + seqId + " is not yet implemented");
    }
  }

}

