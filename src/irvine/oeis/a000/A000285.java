package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000285 a(0) = 1, a(1) = 4, and a(n) = a(n-1) + a(n-2) for n &gt;= 2.
 * @author Sean A. Irvine
 */
public class A000285 extends Sequence0 {

  private Z mA = Z.TWO.negate();
  private Z mB = Z.THREE;

  @Override
  public Z next() {
    final Z t = mA.add(mB);
    mA = mB;
    mB = t;
    return t;
  }
}
