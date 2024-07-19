package irvine.oeis.a293;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A293761 Numbers k such that (d(k), d(k+1)) = (0,0) in the base-2 digits d(i) of sqrt(2).
 * @author Georg Fischer
 */
public class A293761 extends Sequence1 {

  private int mN;
  private final Z mD0;
  private final Z mD1;
  private Z mPrev;
  private final DecimalExpansionSequence mSeq;

  /** Construct the sequence. */
  public A293761() {
    this(0, 0, CR.SQRT2);
  }

  /**
   * Generic constructor with parameters
   * @param d0 first digit
   * @param d1 second digit
   * @param funCR real expression
   */
  public A293761(final int d0, final int d1, final CR funCR) {
    mN = 0;
    mD0 = Z.valueOf(d0);
    mD1 = Z.valueOf(d1);
    mPrev = Z.NEG_ONE; // does not occur
    mSeq = new DecimalExpansionSequence(1, funCR, 2);
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z d = mSeq.next();
      if (mPrev.equals(mD0) && d.equals(mD1)) {
        mPrev = d;
        return Z.valueOf(mN - 1);
      }
      mPrev = d;
    }
  }
}
