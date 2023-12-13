package irvine.oeis.a067;

import irvine.math.group.GaussianIntegers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A067312 Largest leg in right triangle with relatively prime sides and hypotenuse 5^n.
 * @author Sean A. Irvine
 */
public class A067312 extends Sequence1 {

  private static final Pair<Z, Z> C = new Pair<>(Z.THREE, Z.FOUR);
  private Pair<Z, Z> mA = GaussianIntegers.SINGLETON.one();

  @Override
  public Z next() {
    mA = GaussianIntegers.SINGLETON.multiply(mA, C);
    return GaussianIntegers.SINGLETON.re(mA).abs().max(GaussianIntegers.SINGLETON.im(mA).abs());
  }
}
