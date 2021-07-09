package irvine.oeis;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Return the indices of semiprimes in an integer sequence.
 * @author Sean A. Irvine
 */
public abstract class SemiprimeSequence implements Sequence {

  private final Sequence mSeq;
  private int mN;
  private boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  /**
   * Construct the sequence. with the specified initial start index.
   * @param start initial index
   */
  protected SemiprimeSequence(final Sequence seq, final int start) {
    mSeq = seq;
    mN = start - 1;
  }

  /**
   * Construct the sequence. with the specified initial start index.
   * @param start initial index
   */
  protected SemiprimeSequence(final int start) {
    this(null, start);
  }

  /** Construct the sequence. starting at index 0. */
  protected SemiprimeSequence() {
    this(0);
  }

  /**
   * Return the integer to be tested for the specified index.
   * @param n index
   * @return value to test
   */
  protected Z candidate(final int n) {
    return mSeq.next(); // this will NPE if not properly overridden when necessary in subclass
  }

  @Override
  public Z next() {
    while (true) {
      final Z candidate = candidate(++mN);
      final FactorSequence fs = Jaguar.factorUpToSemiprime(candidate);
      if (mVerbose) {
        System.out.println("[" + mN + "] -> " + FactorSequence.toString(fs));
      }
      final int sp = fs.isSemiprime();
      if (sp == FactorSequence.YES) {
        return Z.valueOf(mN);
      }
      if (sp == FactorSequence.UNKNOWN) {
        throw new UnsupportedOperationException("Cannot determine if " + candidate + " is semiprime");
      }
    }
  }

  /**
   * Generate the semiprime sequence from the given starting position.
   * @param args sequence to generate and optional start term
   */
  public static void main(final String[] args) {
    final SemiprimeSequence seq = (SemiprimeSequence) SequenceFactory.sequence(args[0]);
    seq.mVerbose = true;
    if (args.length > 1) {
      seq.mN = Integer.parseInt(args[1]) - 1;
    }
    while (true) {
      System.out.println(seq.next());
    }
  }
}

