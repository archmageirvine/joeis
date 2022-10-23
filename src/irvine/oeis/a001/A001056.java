package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001056 a(n) = a(n-1)*a(n-2) + 1, a(0) = 1, a(1) = 3.
 * @author Sean A. Irvine
 */
public class A001056 extends Sequence0 {

  private Z mA = Z.ZERO;
  private Z mB = Z.TWO;

  @Override
  public Z next() {
    final Z t = mA.multiply(mB).add(1);
    mA = mB;
    mB = t;
    return t;
  }
}
