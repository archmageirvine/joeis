package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001541 a(0) = 1, a(1) = 3; for n &gt; 1, a(n) = 6*a(n-1) - a(n-2).
 * @author Sean A. Irvine
 */
public class A001541 extends Sequence0 {

  private Z mA = Z.valueOf(17);
  private Z mB = Z.THREE;

  @Override
  public Z next() {
    final Z t = mB.multiply(6).subtract(mA);
    mA = mB;
    mB = t;
    return t;
  }
}
