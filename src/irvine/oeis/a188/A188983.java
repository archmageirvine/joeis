package irvine.oeis.a188;

import irvine.math.group.GaussianIntegers;
import irvine.math.z.Z;
import irvine.math.zi.Zi;
import irvine.oeis.Sequence0;

/**
 * A188983 Odd numbers y such that x^2 + y^2 = 13^n with x and y coprime.
 * @author Sean A. Irvine
 */
public class A188983 extends Sequence0 {

  private static final GaussianIntegers G = GaussianIntegers.SINGLETON;
  private static final Zi C = new Zi(Z.THREE, Z.TWO);
  private Zi mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Zi.ONE : G.multiply(mA, C);
    return mA.re().abs();
  }
}
