package irvine.oeis.a062;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a048.A048050;

/**
 * A062975 Half-totient function of n is not divisible by the number of divisors of n.
 * @author Sean A. Irvine
 */
public class A062975 extends A048050 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(Jaguar.factor(mN).sigma0AsLong()) != 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

