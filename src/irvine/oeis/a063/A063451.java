package irvine.oeis.a063;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063451 Numbers k such that k*sigma(k) - 1 is a prime.
 * @author Sean A. Irvine
 */
public class A063451 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).multiply(mN).subtract(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
