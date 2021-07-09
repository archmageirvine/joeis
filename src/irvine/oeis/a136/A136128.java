package irvine.oeis.a136;
// manually 2021-06-13

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A136128 Number of components in all permutations of [1,2,...,n].
 * Recurrence: a(n) = (a(n-1) + (n-1)!)*(n+1)/2; a(1)=1.
 * @author Georg Fischer
 */
public class A136128 implements Sequence {

  private Z mFact;
  private Z mAn;
  private int mN;

  /** Construct the sequence. */
  public A136128() {
    mFact = Z.ONE;
    mAn = Z.ONE;
    mN = 1;
  }

  @Override
  public Z next() {
    final Z result = mAn;
    ++mN;
    mAn = mAn.add(mFact);
    mFact = mFact.multiply(mN);
    mAn = mAn.multiply(mN + 1).divide2();
    return result;
  }
}
