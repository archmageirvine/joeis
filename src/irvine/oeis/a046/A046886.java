package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046886 Number of divisors d of 2n satisfying (d+1) = prime or number of prime factors of the denominator of the even Bernoulli numbers.
 * @author Sean A. Irvine
 */
public class A046886 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    long cnt = 0;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      if (d.add(1).isProbablePrime()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
