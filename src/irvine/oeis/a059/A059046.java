package irvine.oeis.a059;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059046 Numbers n such that sigma(n)-n divides n-1.
 * @author Sean A. Irvine
 */
public class A059046 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Z.valueOf(mN++).mod(Functions.SIGMA.z(mN).subtract(mN)).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
