package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a000.A000010;

/**
 * A054430 Simple self-inverse permutation of natural numbers: List each clump of phi(n) numbers (starting from phi(2) = 1) in reverse order.
 * @author Sean A. Irvine
 */
public class A054430 extends A000010 {

  {
    super.next();
  }
  private long mCnt = super.next().longValueExact();
  private long mK = 1;
  private long mN = 1;

  @Override
  public Z next() {
    if (--mCnt < 0) {
      mCnt = super.next().longValueExact();
      mK += mCnt;
      mN = mK;
      --mCnt;
    }
    return Z.valueOf(mN--);
  }
}
