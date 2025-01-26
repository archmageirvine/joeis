package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074757 Numbers n such that tau(n) = (tau(n+1)+tau(n-1))/2.
 * @author Sean A. Irvine
 */
public class A074757 extends Sequence1 {

  private long mN = 33;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA0.z(++mN).multiply2().equals(Functions.SIGMA0.z(mN - 1).add(Functions.SIGMA0.z(mN + 1)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
