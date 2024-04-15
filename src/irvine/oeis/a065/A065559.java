package irvine.oeis.a065;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065559 Smallest k such that tau(n+k) = tau(k).
 * @author Sean A. Irvine
 */
public class A065559 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      if (Functions.SIGMA0.z(++k).equals(Functions.SIGMA0.z(mN + k))) {
        return Z.valueOf(k);
      }
    }
  }
}
