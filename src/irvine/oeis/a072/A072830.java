package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.a037.A037904;

/**
 * A072830 Absolute value of 2*b(n)-9*n, where b(n) = accumulative sum of the greatest digit of n minus the least digit of n (A037904).
 * @author Sean A. Irvine
 */
public class A072830 extends A037904 {

  private long mN = 0;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mN += 9;
    mSum = mSum.add(super.next());
    return mSum.multiply2().subtract(mN).abs();
  }
}
