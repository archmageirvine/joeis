package irvine.oeis.a081;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A081384 Numbers k such that binomial(prime(k), k) is divisible by k^2.
 * @author Sean A. Irvine
 */
public class A081384 extends A000040 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Binomial.binomial(super.next(), mN).mod(Z.valueOf(mN).square()).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}

