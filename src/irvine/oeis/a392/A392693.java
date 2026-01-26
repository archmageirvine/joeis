package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392693 Numbers k such that sigma(k) = 2*k + 5*phi(k).
 * @author Sean A. Irvine
 */
public class A392693 extends Sequence1 {

  private long mN = 1079;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).equals(Functions.PHI.z(mN).multiply(5).add(2 * mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
