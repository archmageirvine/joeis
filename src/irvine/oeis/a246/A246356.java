package irvine.oeis.a246;

import java.util.function.BiPredicate;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A246356 Numbers k such that d(r,k) = 0 and d(s,k) = 0, where d(x,k) = k-th binary digit of x, r = {sqrt(2)}, s = {sqrt(3)}, and { } = fractional part.
 * @author Georg Fischer
 */
public class A246356 extends AbstractSequence {

  private int mK; // current index
  private final DecimalExpansionSequence mRSeq; // sequence for r
  private final DecimalExpansionSequence mSSeq; // sequence for s
  private final BiPredicate<Integer, Integer> mBiPredicate; // condition for d(r,k) and d(s,k)

  /** Construct the sequence. */
  public A246356() {
    this(1, CR.SQRT2.frac(), CR.THREE.sqrt().frac(), (drk, dsk) -> drk == 0 && dsk == 0);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param r first fraction
   * @param s second fraction
   * @param predicate condition for d(r, k) and d(s, k)
   */
  public A246356(final int offset, final CR r, final CR s, final BiPredicate<Integer, Integer> predicate) {
    super(offset);
    mK = offset - 1;
    mRSeq = new DecimalExpansionSequence(0, r, 2);
    mSSeq = new DecimalExpansionSequence(0, s, 2);
    mBiPredicate = predicate;
  }

  @Override
  public Z next() {
    while (true) {
      ++mK;
      final int r = mRSeq.next().intValueExact();
      final int s = mSSeq.next().intValueExact();
      if (mBiPredicate.test(r, s)) {
        return Z.valueOf(mK);
      }
    }
  }
}
