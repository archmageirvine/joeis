package irvine.oeis.a019;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A019288 Let sigma_m (n) be result of applying sum-of-divisors function m times to n; call n (m,k)-perfect if sigma_m (n) = k*n; sequence gives the (2,11)-perfect numbers.
 * @author Sean A. Irvine
 */
public class A019288 extends Sequence1 {

  private Z mN = Z.valueOf(4404479);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Functions.SIGMA1.z(Jaguar.factor(mN).sigma()).equals(mN.multiply(11))) {
        return mN;
      }
    }
  }
}

