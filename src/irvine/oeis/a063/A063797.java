package irvine.oeis.a063;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063797 Numbers n such that sigma(d(n^3))==d(sigma(n^2)), where d(n) is the number of divisors of n.
 * @author Sean A. Irvine
 */
public class A063797 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Functions.SIGMA1.z(Functions.SIGMA0.z(mN.pow(3))).equals(Functions.SIGMA0.z(Functions.SIGMA1.z(mN.square())))) {
        return mN;
      }
    }
  }
}
