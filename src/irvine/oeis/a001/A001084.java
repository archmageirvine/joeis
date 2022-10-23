package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001084 a(n) = 20*a(n-1) - a(n-2) with a(0) = 0, a(1) = 3.
 * @author Sean A. Irvine
 */
public class A001084 extends Sequence0 {

  private Z mA = Z.valueOf(-60);
  private Z mB = Z.valueOf(-3);

  @Override
  public Z next() {
    final Z t = mB.multiply(20).subtract(mA);
    mA = mB;
    mB = t;
    return t;
  }
}

