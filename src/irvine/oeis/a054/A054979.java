package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a051.A051377;

/**
 * A054979 e-perfect numbers: numbers k such that the sum of the e-divisors (exponential divisors) of k equals 2*k.
 * @author Sean A. Irvine
 */
public class A054979 extends A051377 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().equals(Z.valueOf(2L * mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}

