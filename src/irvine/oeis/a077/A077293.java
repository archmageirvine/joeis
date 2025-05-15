package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077293 Partition the concatenation 1234567...of natural numbers into successive strings nontrivially (a(n) is not equal to n) such that the n-th string is a multiple of n.
 * @author Sean A. Irvine
 */
public class A077293 extends Sequence1 {

  private long mLim = 10;
  private long mM = 0;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z v = Z.ZERO;
    while (true) {
      if (++mM == mLim) {
        mLim *= 10;
      }
      v = v.multiply(mLim).add(mM);
      if (v.mod(mN) == 0 && !v.equals(mN)) {
        return v;
      }
    }
  }
}
