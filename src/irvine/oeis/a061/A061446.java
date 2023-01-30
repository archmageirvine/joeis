package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A061446 Primitive part of Fibonacci(n).
 * @author Sean A. Irvine
 */
public class A061446 extends A000045 {

  {
    super.next();
    setOffset(1);
  }
  private Z mLcm = Z.ONE;

  @Override
  public Z next() {
    final Z d = mLcm;
    mLcm = mLcm.lcm(super.next());
    return mLcm.divide(d);
  }
}
