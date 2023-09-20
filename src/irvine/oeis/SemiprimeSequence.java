package irvine.oeis;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Return the indices of semiprimes in an integer sequence.
 * @author Sean A. Irvine
 */
public abstract class SemiprimeSequence extends AbstractSequence {

  private final Sequence mSeq;
  private int mN;
  private boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  /**
   * Construct the sequence. with the specified initial start index.
   * @param offset sequence offset
   * @param seq underlying sequence
   * @param start initial index
   */
  protected SemiprimeSequence(final int offset, final Sequence seq, final int start) {
    super(offset);
    mSeq = seq;
    mN = start - 1;
  }

  /**
   * Construct the sequence. with the specified initial start index.
   * @param seq underlying sequence
   * @param start initial index
   */
  protected SemiprimeSequence(final Sequence seq, final int start) {
    this(1, seq, start);
  }

  /**
   * Construct the sequence. with the specified initial start index.
   * @param offset sequence offset
   * @param start initial index
   */
  protected SemiprimeSequence(final int offset, final Sequence seq) {
    this(offset, seq, 0);
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
}

