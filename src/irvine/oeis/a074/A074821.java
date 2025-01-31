package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074821 Numbers k such that tau(k) = tau(2k+1).
 * @author Sean A. Irvine
 */
public class A074821 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA0.z(++mN).equals(Functions.SIGMA0.z(2* mN + 1))) {
        return Z.valueOf(mN);
      }
    }
  }
}
