package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067261 Numbers n such that sigma(n+1)=3*phi(n).
 * @author Sean A. Irvine
 */
public class A067261 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN + 1).equals(Functions.PHI.z(mN).multiply(3))) {
        return Z.valueOf(mN);
      }
    }
  }
}

