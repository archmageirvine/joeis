package irvine.oeis.a019;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019290 Let sigma_m (n) be result of applying sum-of-divisors function m times to n; call n (m,k)-perfect if sigma_m (n) = k*n; sequence gives the (2,13)-perfect numbers.
 * @author Sean A. Irvine
 */
public class A019290 implements Sequence {

  private Z mN = Z.valueOf(57119);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Jaguar.factor(Jaguar.factor(mN).sigma()).sigma().equals(mN.multiply(13))) {
        return mN;
      }
    }
  }
}

