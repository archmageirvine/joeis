package irvine.oeis.a076;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076617 Numbers k such that sum of the divisors d of k divides 1 + 2 + ... + k = k(k+1)/2.
 * @author Sean A. Irvine
 */
public class A076617 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z sigma = Jaguar.factor(++mN).sigma();
      if ((mN * (mN + 1) / 2) % sigma.longValueExact() == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
