package irvine.oeis.a062;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a023.A023022;

/**
 * A062976 Half-totient function of n is divisible by the number of divisors of n.
 * @author Sean A. Irvine
 */
public class A062976 extends A023022 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(Jaguar.factor(++mN).sigma0AsLong()) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

