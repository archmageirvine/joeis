package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392692 Numbers k such that sigma(k) = 2*k + 4*phi(k).
 * @author Sean A. Irvine
 */
public class A392692 extends Sequence1 {

  private long mN = 7319;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).equals(Functions.PHI.z(mN).multiply(4).add(2 * mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
