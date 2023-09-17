package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065873 Numbers k such that usigma(k) +-1 are twin primes, where usigma(k) is the sum of the unitary divisors of k (A034448).
 * @author Sean A. Irvine
 */
public class A065873 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z u = Jaguar.factor(++mN).unitarySigma();
      if (u.subtract(1).isProbablePrime() && u.add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

