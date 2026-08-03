package irvine.oeis.a339;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A339558 Number of divisors of 2n that are the average of a pair of twin primes.
 * @author Sean A. Irvine
 */
public class A339558 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (final Z d : Jaguar.factor(2 * mN).divisors()) {
      if (d.subtract(1).isProbablePrime() && d.add(1).isProbablePrime()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
