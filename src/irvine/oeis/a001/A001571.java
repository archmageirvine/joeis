package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001571 a(n) = 4*a(n-1) - a(n-2) + 1, with a(0) = 0, a(1) = 2.
 * @author Sean A. Irvine
 */
public class A001571 extends Sequence0 {

  private Z mA = Z.valueOf(-3);
  private Z mB = Z.NEG_ONE;

  @Override
  public Z next() {
    final Z t = mB.shiftLeft(2).subtract(mA).add(1);
    mA = mB;
    mB = t;
    return t;
  }
}
