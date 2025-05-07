package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077087 Numbers k such that sigma(k+1) = 3 * sigma(k).
 * @author Sean A. Irvine
 */
public class A077087 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN + 1).equals(Functions.SIGMA1.z(mN).multiply(3))) {
        return Z.valueOf(mN);
      }
    }
  }
}

