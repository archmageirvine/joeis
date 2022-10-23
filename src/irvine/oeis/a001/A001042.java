package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001042 a(n) = a(n-1)^2 - a(n-2)^2.
 * @author Sean A. Irvine
 */
public class A001042 extends Sequence0 {

  private Z mA = Z.valueOf(-2);
  private Z mB = Z.NEG_ONE;

  @Override
  public Z next() {
    final Z t = mB.subtract(mA);
    mA = mB;
    mB = t.square();
    return t;
  }
}
