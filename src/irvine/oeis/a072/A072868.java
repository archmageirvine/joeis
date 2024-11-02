package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072868 Numbers k such that sigma(sigma(k) - k) = k.
 * @author Sean A. Irvine
 */
public class A072868 extends Sequence1 {

  private Z mN = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Functions.SIGMA1.z(Functions.SIGMA1.z(mN).subtract(mN)).equals(mN)) {
        return mN;
      }
    }
  }
}

