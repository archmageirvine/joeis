package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003481 a(n) = 7*a(n-1) - a(n-2) + 5.
 * @author Sean A. Irvine
 */
public class A003481 extends Sequence0 {

  private Z mA = Z.valueOf(-4);
  private Z mB = Z.NEG_ONE;

  @Override
  public Z next() {
    final Z t = mB.multiply(7).subtract(mA).add(5);
    mA = mB;
    mB = t;
    return mB;
  }
}

