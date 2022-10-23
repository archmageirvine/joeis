package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001090 a(n) = 8*a(n-1) - a(n-2); a(0) = 0, a(1) = 1.
 * @author Sean A. Irvine
 */
public class A001090 extends Sequence0 {

  private Z mA = Z.valueOf(-8);
  private Z mB = Z.NEG_ONE;

  @Override
  public Z next() {
    final Z t = mB.shiftLeft(3).subtract(mA);
    mA = mB;
    mB = t;
    return t;
  }
}

