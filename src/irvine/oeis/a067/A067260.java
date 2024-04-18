package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067260 Numbers k such that sigma(k+1) = 2*phi(k).
 * @author Sean A. Irvine
 */
public class A067260 extends Sequence1 {

  private long mN = 12;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA.z(++mN + 1).equals(Functions.PHI.z(mN).multiply2())) {
        return Z.valueOf(mN);
      }
    }
  }
}

