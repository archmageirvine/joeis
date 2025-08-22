package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074875 Numbers k such that sigma(sigma(k)-k) = phi(k).
 * @author Sean A. Irvine
 */
public class A074875 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(Functions.SIGMA1.z(++mN).subtract(mN)).equals(Functions.PHI.z(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
