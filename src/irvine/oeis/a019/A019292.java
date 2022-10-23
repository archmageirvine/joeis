package irvine.oeis.a019;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A019292 Let sigma_m (n) be result of applying sum-of-divisors function m times to n; call n (m,k)-perfect if sigma_m (n) = k*n; sequence gives the (3,k)-perfect numbers.
 * @author Sean A. Irvine
 */
public class A019292 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Jaguar.factor(Jaguar.factor(Jaguar.factor(mN).sigma()).sigma()).sigma().mod(mN).isZero()) {
        return mN;
      }
    }
  }
}

