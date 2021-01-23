package irvine.oeis.a036;

import irvine.math.group.GaussianIntegers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Pair;

/**
 * A036842 Smallest leg in right triangle with relatively prime sides and hypotenuse 5^n.
 * @author Sean A. Irvine
 */
public class A036842 implements Sequence {

  private static final Pair<Z, Z> C = new Pair<>(Z.THREE, Z.FOUR);
  private Pair<Z, Z> mA = GaussianIntegers.SINGLETON.one();

  @Override
  public Z next() {
    mA = GaussianIntegers.SINGLETON.multiply(mA, C);
    return GaussianIntegers.SINGLETON.re(mA).abs().min(GaussianIntegers.SINGLETON.im(mA).abs());
  }
}
