package irvine.oeis.a036;

import irvine.math.group.GaussianIntegers;
import irvine.math.z.Z;
import irvine.math.zi.Zi;
import irvine.oeis.Sequence1;

/**
 * A036842 Smallest leg in right triangle with relatively prime sides and hypotenuse 5^n.
 * @author Sean A. Irvine
 */
public class A036842 extends Sequence1 {

  private static final Zi C = new Zi(Z.THREE, Z.FOUR);
  private Zi mA = Zi.ONE;

  @Override
  public Z next() {
    mA = GaussianIntegers.SINGLETON.multiply(mA, C);
    return GaussianIntegers.SINGLETON.re(mA).abs().min(GaussianIntegers.SINGLETON.im(mA).abs());
  }
}
