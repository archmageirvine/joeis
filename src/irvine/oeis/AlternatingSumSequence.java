package irvine.oeis;

import java.lang.reflect.InvocationTargetException; 

import irvine.math.z.Z;

/**
 * Partial sums of another sequence with alternating signs of the summands.
 * @author Georg Fischer
 */
public class AlternatingSumSequence extends AbstractSequence {

  private final Sequence mSeq;
  protected Z mSum = Z.ZERO;
  private final String mPattern; // sequence of "+" and "-" characters 
  private final int mPatternLength; // length of the pattern
  private int mN; // always starts at 0

  /**
   * Constructor with offset, another sequence and a sign pattern.
   * @param offset sequence offset
   * @param seq sequence to compute partial sums of
   * @param pattern pattern for the signs, for example "+-" or "--++"
   */
  public AlternatingSumSequence(final int offset, final Sequence seq, final String pattern) {
    super(offset);
    mN = -1; // independent of the target offset!
    mSeq = seq;
    mPatternLength = pattern.length();
    mPattern = pattern;
  }

  /**
   * Constructor with offset, another sequence and a sign pattern and default offset 0.
   * @param seq sequence to compute partial sums of
   * @param pattern pattern for the signs, for example "+-" or "--++"
   */
  public AlternatingSumSequence(final Sequence seq, final String pattern) {
    this(0, seq, pattern);
  }

  @Override
  public Z next() {
    ++mN;
    mSum = mPattern.charAt(mN % mPatternLength) == '+' 
        ? mSum.add(mSeq.next()) 
        : mSum.subtract(mSeq.next());
    return mSum;
  }

  /**
   * Main test method: compute the partial alternating sums of another sequences
   * @param args command line arguments:
   * <ul>
   * <li>-a list of (A-number eventually followed by a negative skip count (default 0))</li>
   * <li>-n number of terms (default 32)</li>
   * <li>-o offset, first index (default 0) </li>
   * <li>-p sign pattern (default "+-")</li>
   * </ul>
   */
  public static void main(final String[] args) {
    int debug = 0;
    String aSeqNo = "A007528";
    String pattern = "+-";
    int offset = 0;
    int noTerms = 32;
    int iarg = 0;
    while (iarg < args.length) { // consume all arguments
      final String opt = args[iarg++];
      try {
        if (opt.equals("-d")) {
          debug = Integer.parseInt(args[iarg++]);
        } else if (opt.equals("-a")) {
          aSeqNo = args[iarg++];
        } else if (opt.equals("-n")) {
          noTerms = Integer.parseInt(args[iarg++]);
        } else if (opt.equals("-o")) {
          offset = Integer.parseInt(args[iarg++]);
        } else if (opt.equals("-p")) {
          pattern = args[iarg++];
        } else {
          System.err.println("??? invalid option: \"" + opt + "\"");
        }
      } catch (final Exception exc) { // take defaults
        System.err.println("wrong option: " + args[iarg - 1] + ", message: " + exc.getMessage());
      }
    }
    final Sequence seq;
    try {
      seq = (Sequence) Class.forName("irvine.oeis.a" + aSeqNo.substring(1, 4) + '.' + aSeqNo).getDeclaredConstructor().newInstance();
    } catch (final ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException exc) {
      throw new UnsupportedOperationException("invalid A-number: " + aSeqNo);
    }

    final AlternatingSumSequence asu = new AlternatingSumSequence(offset, seq, pattern);
    for (int iterm = 0; iterm < noTerms; ++iterm) {
      if (iterm > 0) {
        System.out.print(",");
      }
      System.out.print(asu.next());
    } 
    System.out.println();
  }
}

