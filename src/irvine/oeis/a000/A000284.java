package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000284 a(n) = a(n-1)^3 + a(n-2) with a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A000284 extends Sequence0 {

  private Z mA = Z.NEG_ONE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    final Z t = mB.pow(3).add(mA);
    mA = mB;
    mB = t;
    return t;
  }
}
