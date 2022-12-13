package irvine.oeis.a217;

import irvine.math.z.Z;
import irvine.oeis.a007.A007489;

/**
 * A217239 a(n) = n!*(!n - 1) = n! * Sum_{k=1..n-1} k!.
 * @author Georg Fischer
 */
public class A217239 extends A007489 {

  private int mN = -1;
  private Z mFact = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    if (mN >= 2) {
      mFact = mFact.multiply(mN);
    }
    return mFact.multiply((mN == 0) ? Z.ZERO : super.next());
  }
}
