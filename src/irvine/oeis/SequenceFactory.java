package irvine.oeis;

import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.apfloat.ApfloatRuntimeException;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.producer.MetaProducer;
import irvine.oeis.producer.Producer;
import irvine.oeis.transform.BinomialTransformSequence;
import irvine.oeis.transform.EulerTransform;
import irvine.oeis.transform.GilbreathTransformSequence;
import irvine.oeis.transform.InverseAronsonTransformSequence;
import irvine.oeis.transform.InverseBinomialTransformSequence;
import irvine.oeis.transform.InverseEulerTransform;
import irvine.oeis.transform.InverseMobiusTransformSequence;
import irvine.oeis.transform.InverseWeighTransform;
import irvine.oeis.transform.InvertTransform;
import irvine.oeis.transform.MobiusTransformSequence;
import irvine.oeis.transform.SimpleTransformSequence;
import irvine.oeis.transform.Stirling1TransformSequence;
import irvine.oeis.transform.Stirling2TransformSequence;
import irvine.oeis.transform.WeighTransformSequence;
import irvine.util.CliFlags;
import irvine.util.string.Date;
import irvine.util.string.StringUtils;

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
  private static final String AUTHOR = "author";
  private static final String B_FILE = "b-file";
  private static final String DATA = "data";
  private static final String DATA_LENGTH = "data-length";
  private static final String HEADER = "header";
  private static final String OFFSET = "offset";
  private static final String PRIORITY = "priority";
  private static final String RIGHT = "right";
  private static final String ROW_NUMBERS = "row-numbers";
  private static final String ROWS = "rows";
  private static final String SQUARE = "square";
  private static final String TERMS = "terms";
  private static final String TIMESTAMP = "timestamp";
  private static final String TRIANGLE = "triangle";

  /**
   * Convert a sequence identifier to a padded out A-number.
   * @param seqId sequence identifier
   * @return canonical name
   */
  public static String getCanonicalId(String seqId) {
    if (seqId != null && !seqId.isEmpty()) {
      if ("-".equals(seqId)) {
        return seqId;
      }
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

  private static Producer sProducer = MetaProducer.createDefaultProducer();

  /**
   * Return the sequence for the specified A-number. The sequence is not
   * known then <code>UnsupportedOperationException</code> is thrown.
   * @param aNumber A-number identifier in the form <code>A000001</code>
   * @param producer the Producer to use
   * @return sequence for A-number
   * @exception UnimplementedException for an unknown A-number.
   */
  public static Sequence sequence(final String aNumber, final Producer producer) throws UnimplementedException {
    final Sequence seq = producer.getSequence(aNumber);
    if (seq == null || seq instanceof UnimplementedSequence) {
      throw new UnimplementedException();
    }
    return seq;
  }

  /**
   * Return the sequence for the specified A-number or expression.
   * The <code>expression</code> is usually an A-number, but other various transformation are also supported.
   * For example, to compute the Euler transform of the integers: <code>euler(A000027)</code>.
   * Functions can be chained to arbitrary depth: <code>euler(lpf(A000027))</code>.
   * It is also possible to skip some initial portion of a sequence: <code>A000027.skip(5)</code>.
   * Finally, the <code>expression</code> can be "-" indicating sequence terms should be read from standard
   * input, one term per line.
   * @param expression description of sequence to be generated
   * @return sequence for A-number
   * @exception UnimplementedException for an unknown A-number.
   * @exception IllegalArgumentException if the supplied expression could not be interpreted.
   */
  public static Sequence sequence(final String expression) throws UnimplementedException {
    if ("-".equals(expression) || expression.matches("A[0-9]+")) {
      return sequence(getCanonicalId(expression), sProducer);
    }
    if (expression.matches(".*\\.skip\\([0-9]+\\)")) {
      final int skipPos = expression.lastIndexOf(".skip");
      final int skip = Integer.parseInt(expression.substring(skipPos + ".skip(".length(), expression.length() - 1));
      return sequence(expression.substring(0, skipPos)).skip(skip);
    }
    if (expression.matches("[A-Za-z][A-Za-z0-9]*\\(.*\\)")) {
      final int open = expression.indexOf('(');
      final String function = expression.substring(0, open);
      final String inner = expression.substring(open + 1, expression.length() - 1);
      switch (function) {
        case "abs":
          return new SimpleTransformSequence(1, sequence(inner), Z::abs);
        case "binomial":
          return new BinomialTransformSequence(sequence(inner), 0);
        case "ibinomial":
          return new InverseBinomialTransformSequence(sequence(inner), 0);
        case "delta":
          return new DifferenceSequence(1, sequence(inner));
        case "euler":
          return new EulerTransform(1, sequence(inner));
        case "gilbreath":
          return new GilbreathTransformSequence(1, sequence(inner));
        case "gpf":
          return new SimpleTransformSequence(sequence(inner), Functions.GPF::z);
        case "ieuler":
          return new InverseEulerTransform(1, sequence(inner));
        case "imobius":
          return new InverseMobiusTransformSequence(sequence(inner), 0);
        case "invert":
          return new InvertTransform(0, sequence(inner));
        case "iweigh":
          return new InverseWeighTransform(sequence(inner));
        case "lpf":
          return new SimpleTransformSequence(sequence(inner), Functions.LPF::z);
        case "mobius":
          return new MobiusTransformSequence(sequence(inner), 0);
        case "mu":
          return new SimpleTransformSequence(sequence(inner), Functions.MOBIUS::z);
        case "omega":
          return new SimpleTransformSequence(sequence(inner), Functions.OMEGA::z);
        case "Omega":
          return new SimpleTransformSequence(sequence(inner), Functions.BIG_OMEGA::z);
        case "phi":
          return new SimpleTransformSequence(sequence(inner), Functions.PHI::z);
        case "prime":
          return new FilterSequence(sequence(inner), FilterSequence.PRIME);
        case "record":
          return new RecordSequence(sequence(inner));
        case "semiprime":
          return new FilterSequence(sequence(inner), FilterSequence.SEMIPRIME);
        case "sigma":
          return new SimpleTransformSequence(sequence(inner), Functions.SIGMA1::z);
        case "sigma0":
          return new SimpleTransformSequence(sequence(inner), Functions.SIGMA0::z);
        case "stirling1":
          return new Stirling1TransformSequence(1, sequence(inner));
        case "stirling2":
          return new Stirling2TransformSequence(sequence(inner), 0);
        case "sum":
          return new PartialSumSequence(sequence(inner));
        case "weigh":
          return new WeighTransformSequence(1, sequence(inner));
        case "iaronson":
          return new InverseAronsonTransformSequence(1, sequence(inner));
        default:
          throw new IllegalArgumentException("Unexpected function: " + function);
      }
    }
    throw new IllegalArgumentException("Could not understand: " + expression);
  }

  /**
   * Attempt to retrieve the offset associated with a sequence.
   * @param seq the sequence
   * @return the offset
   */
  public static int getOffset(final Sequence seq) {
    return seq.getOffset();
  }

  /**
   * Attempt to retrieve the offset associated with a sequence.
   * If the offset was set on the command line that takes priority.
   * @param flags command line flags
   * @param seq the sequence
   * @return the offset
   */
  public static int getOffset(final CliFlags flags, final Sequence seq) {
    if (flags.isSet(OFFSET)) {
      return (Integer) flags.getValue(OFFSET);
    }
    return getOffset(seq);
  }

  private static boolean dataLineOutputMode(final CliFlags flags, final OutputStream out, final Sequence seq, final String seqId) throws IOException {
    final int maxDataLength = (Integer) flags.getValue(DATA_LENGTH);
    final long numberOfTerms = getEffectiveMax(flags, TERMS);
    Z z;
    long termCnt = 0;
    int outputSoFar = 0;
    try {
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
    } catch (final UnsupportedOperationException e) {
      if (outputSoFar > 0) {
        out.write(LS);
        out.flush();
        System.err.println("Implementation limits exceeded, cannot generate further terms for " + seqId + "\n" + e.getMessage());
      } else {
        throw e;
      }
    }
    return outputSoFar > 0;
  }

  private static long getEffectiveMax(final CliFlags flags, final String option) {
    final long numberOfTerms = (Long) flags.getValue(option);
    return numberOfTerms == 0 ? Long.MAX_VALUE : numberOfTerms;
  }

  private static boolean triangleOutputMode(final CliFlags flags, final OutputStream out, final Sequence seq) throws IOException {
    final boolean timestamp = flags.isSet(TIMESTAMP);
    final boolean rowNumbers = flags.isSet(ROW_NUMBERS);
    final long offset = getOffset(flags, seq);
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

  private static void generateOutput(final OutputStream out, final List<List<String>> table) throws IOException {
    // Compute width for each column
    final int[] padding = new int[table.get(0).size()];
    for (final List<String> lst : table) {
      for (int k = 0; k < lst.size(); ++k) {
        padding[k] = Math.max(padding[k], lst.get(k).length());
      }
    }
    final String[] pads = new String[padding.length];
    for (int k = 0; k < padding.length; ++k) {
      pads[k] = StringUtils.rep(' ', padding[k]);
    }
    // Generate the actual output
    for (final List<String> lst : table) {
      for (int k = 0; k < lst.size(); ++k) {
        if (k > 0) {
          out.write(SPACE); // minimum space between columns
        }
        // Write the term, right justified
        final String paddedTerm = pads[k] + lst.get(k);
        out.write(paddedTerm.substring(paddedTerm.length() - padding[k]).getBytes(StandardCharsets.US_ASCII));
      }
      out.write(LS);
    }
  }

  private static boolean upperRightTriangleOutputMode(final CliFlags flags, final OutputStream out, final Sequence seq) throws IOException {
    // This output mode needs to know exactly how many terms are to be produced in advance.
    // We precompute the entire triangle before output.
    final long numberOfTerms = getEffectiveMax(flags, TERMS);
    final long maxRow = getEffectiveMax(flags, ROWS);

    // Rows are padded on the left with empty cells
    final ArrayList<List<String>> asSquareTable = new ArrayList<>();
    Z z;
    long termCnt = 0;
    int col = -1;
    int row = -1;
    while (++termCnt <= numberOfTerms && (z = seq.next()) != null) {
      if (++row > col) {
        // We are starting a new column
        if (asSquareTable.size() == maxRow) {
          break; // We are finished collecting terms
        }
        final ArrayList<String> t = new ArrayList<>();
        for (int k = 0; k < row; ++ k) {
          t.add(""); // padding
        }
        asSquareTable.add(t);
        ++col;
        row = 0;
      }
      asSquareTable.get(row).add(z.toString());
    }
    if (asSquareTable.isEmpty()) {
      return false; // There were no terms
    }
    if (row != 0) {
      while (++row < asSquareTable.size()) {
        asSquareTable.get(row).add(".");
      }
    }
    generateOutput(out, asSquareTable);
    return true;
  }

  private static boolean squareArrayOutputMode(final CliFlags flags, final OutputStream out, final Sequence seq) throws IOException {
    // This output mode needs to know exactly how many terms are to be produced in advance.
    // We precompute the entire square before output.
    final long numberOfTerms = getEffectiveMax(flags, TERMS);
    final long maxRow = getEffectiveMax(flags, ROWS);

    // We will fill as much of the "square" as we can, but if -n is used
    // it will look more like a triangle.

    final ArrayList<List<String>> asSquareTable = new ArrayList<>();
    Z z;
    long termCnt = 0;
    int col = -1;
    int row = -1;
    while (++termCnt <= numberOfTerms && (z = seq.next()) != null) {
      if (++row > col) {
        // We are logically starting a new column
        // However, we might not add it if we are reached the target square size
        if (asSquareTable.size() == maxRow) {
          if (termCnt == Long.MAX_VALUE) {
            break; // We are finished collecting terms
          }
        } else {
          asSquareTable.add(new ArrayList<>());
        }
        ++col;
        row = 0;
      }
      if (row < maxRow && col - row < maxRow) {
        asSquareTable.get(row).add(z.toString());
      }
      if (row == maxRow - 1 && col - row == maxRow - 1) {
        break; // The square was completely filled
      }
    }
    if (asSquareTable.isEmpty()) {
      return false; // There were no terms
    }
    if (row != 0) {
      while (++row < asSquareTable.size()) {
        asSquareTable.get(row).add(".");
      }
    }
    generateOutput(out, asSquareTable);
    return true;
  }

  private static final String[][] INCOMPATIBLE_OPTIONS = {
    {B_FILE, DATA},
    {B_FILE, TRIANGLE},
    {B_FILE, RIGHT},
    {B_FILE, SQUARE},
    {DATA, HEADER},
    {DATA, TIMESTAMP},
    {DATA, TRIANGLE},
    {DATA, RIGHT},
    {DATA, SQUARE},
    {TRIANGLE, HEADER},
    {TRIANGLE, RIGHT},
    {TRIANGLE, SQUARE},
    {RIGHT, TIMESTAMP},
    {RIGHT, SQUARE},
    {RIGHT, HEADER},
    {SQUARE, HEADER},
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
        parseMessage.append("Setting ").append(getOptionString(flags.getFlag(pair[0])));
        parseMessage.append(" incompatible with ").append(getOptionString(flags.getFlag(pair[1])));
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
      return false;
    }
    final long n = (Long) flags.getValue(TERMS);
    if (n < 0) {
      flags.setParseMessage("--" + TERMS + " must be non-negative");
      return false;
    }
    if (flags.isSet(RIGHT) && !(flags.isSet(TERMS) || flags.isSet(ROWS))) {
      flags.setParseMessage(getOptionString(flags.getFlag(RIGHT)) + " requires either -n or -r to be specified");
      return false;
    }
    if (flags.isSet(SQUARE) && !(flags.isSet(TERMS) || flags.isSet(ROWS))) {
      flags.setParseMessage(getOptionString(flags.getFlag(SQUARE)) + " requires either -n or -r to be specified");
      return false;
    }
    return true;
  };

  private static String getUsername(final CliFlags flags) {
    if (flags.isSet(AUTHOR)) {
      return (String) flags.getValue(AUTHOR);
    }
    return System.getenv("OEIS_USERNAME");
  }

  /**
   * Generate terms from specified sequence, writing one term per line.
   * @param args sequence identifier
   * @param out stream where to write the output
   * @param exitOk whether the flag validator may call <code>System.exit()</code>
   * @throws IOException if an I/O error occurs.
   */
  public static void process(final String[] args, final OutputStream out, final boolean exitOk) throws IOException {
    CliFlags.DEFAULT_INVALID_FLAG_HANDLER.setExitOk(exitOk);
    final CliFlags flags = new CliFlags("SequenceFactory", "Generate terms for an OEIS sequence.");
    flags.registerOptional('B', B_FILE, "Output in b-file format");
    flags.registerOptional('D', DATA, "Output in a format suitable for pasting into a DATA line");
    flags.registerOptional('T', TRIANGLE, "Output data as a triangle");
    flags.registerOptional('R', RIGHT, "Output data as an upper right triangle");
    flags.registerOptional('S', SQUARE, "Output data as a square array");
    flags.registerOptional('n', TERMS, Long.class, "number", "Maximum number of terms to generate (or 0 for unbounded)", 0L);
    flags.registerOptional('r', ROWS, Long.class, "number", "Maximum number of rows to generate in a triangle (or 0 for unbounded)", 0L);
    flags.registerOptional('o', OFFSET, Integer.class, "number", "Offset to use (relevant for -B and -T with --" + ROW_NUMBERS + ")");
    flags.registerOptional('t', TIMESTAMP, "Add a timestamp to each line of output");
    flags.registerOptional(DATA_LENGTH, Integer.class, "number", "Maximum total length of output line in characters (in conjunction with -D)", DEFAULT_DATA_LENGTH);
    flags.registerOptional(HEADER, "Print a header");
    flags.registerOptional('a', AUTHOR, String.class, "name", "Specify author name for b-file output");
    flags.registerOptional(PRIORITY, String.class, "string", "Comma separated list of priority for programs (e.g., java,gp)");
    flags.registerOptional(ROW_NUMBERS, "Include row numbers in triangle (-T) output");
    flags.registerRequired(String.class, "A-number", "Sequence to generate (or \"-\" to read standard input)");
    flags.setValidator(VALIDATOR);
    flags.setFlags(args);
    final boolean timestamp = flags.isSet(TIMESTAMP);
    final boolean bfile = flags.isSet(B_FILE);
    final boolean header = flags.isSet(HEADER);
    if (flags.isSet(PRIORITY)) {
      sProducer = MetaProducer.createProducer((String) flags.getValue(PRIORITY));
    }
    final String seqId = flags.getAnonymousValue(0).toString();
    boolean generated = false;
    final long numberOfTerms = getEffectiveMax(flags, TERMS);
    try {
      final Sequence seq = sequence(seqId);
      if (seq instanceof Conjectural) {
        System.out.println("# WARNING: Implementation is conjectural, do not use output to extend the OEIS.");
      }
      final int offset = getOffset(flags, seq);
      try {
        if (bfile && header) {
          final StringBuilder header1 = new StringBuilder("# Table of a(n)");
          if (numberOfTerms != Long.MAX_VALUE) {
            header1.append(", ").append(offset).append("..").append(offset + numberOfTerms - 1);
          }
          out.write(header1.toString().getBytes(StandardCharsets.US_ASCII));
          out.write(LS);
          final StringBuilder header2 = new StringBuilder("# b")
            .append(seqId.substring(1)).append(".txt generated with jOEIS");
          final String author = getUsername(flags);
          if (author != null) {
            header2.append(" by ").append(author);
          }
          header2.append(" at ").append(Date.now());
          out.write(header2.toString().getBytes(StandardCharsets.US_ASCII));
          out.write(LS);
          out.flush();
        }
        if (flags.isSet(DATA)) {
          generated = dataLineOutputMode(flags, out, seq, seqId);
        } else if (flags.isSet(TRIANGLE)) {
          generated = triangleOutputMode(flags, out, seq);
        } else if (flags.isSet(RIGHT)) {
          generated = upperRightTriangleOutputMode(flags, out, seq);
        } else if (flags.isSet(SQUARE)) {
          generated = squareArrayOutputMode(flags, out, seq);
        } else {
          Z z;
          long termCnt = 0;
          while (++termCnt <= numberOfTerms && (z = seq.next()) != null) {
            generated = true;
            if (bfile) {
              out.write(String.valueOf(termCnt + offset - 1).getBytes(StandardCharsets.US_ASCII));
              out.write(SPACE);
            } else if (timestamp) {
              out.write(Date.now().getBytes(StandardCharsets.US_ASCII));
            }
            out.write(z.toString().getBytes(StandardCharsets.US_ASCII));
            if (bfile && timestamp) {
              out.write(" # ".getBytes(StandardCharsets.US_ASCII));
              out.write(Date.now().getBytes(StandardCharsets.US_ASCII));
            }
            out.write(LS);
            out.flush();
          }
          if (bfile && termCnt > numberOfTerms) {
            out.write(LS); // two blank lines at end of bfile
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
      } finally {
        if (seq instanceof Closeable) {
          ((Closeable) seq).close();
        }
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
        throw e;
      }
    } catch (final UnimplementedException e) {
      System.err.println("Sorry, " + seqId + " is not yet implemented");
    }
  }

  /**
   * Convenience method to print the specified number of terms.
   * @param seq sequence
   * @param terms number of terms
   */
  public static void printTerms(final Sequence seq, final int terms) {
    for (int t = 0; t < terms; ++t) {
      if (t > 0) {
        System.out.print(',');
      }
      System.out.print(seq.next());
    }
    System.out.println();
  }

  /**
   * Generate terms from specified sequence, writing one term per line.
   * @param args sequence identifier
   * @throws IOException if an I/O error occurs.
   */
  public static void main(final String[] args) throws IOException {
    // We use our own version of output stream here, so that we can better detect closed pipes
    // Does what it can to ensure terms are flushed to output as soon as possible
    try (final OutputStream out = new BufferedOutputStream(new FileOutputStream(FileDescriptor.out))) {
      process(args, out, true);
    } catch (final IOException e) {
      // Broken pipe usually means consuming process terminated, so we allow that through without error
      if (!e.getMessage().contains("Broken pipe")) {
        throw e;
      }
    }
  }
}
