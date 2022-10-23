package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000280 a(n) = a(n-1) + a(n-2)^3.
 * @author Sean A. Irvine
 */
public class A000280 extends Sequence0 {

  private Z mA = Z.NEG_ONE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    final Z t = mB.add(mA.pow(3));
    mA = mB;
    mB = t;
    return t;
  }
}
