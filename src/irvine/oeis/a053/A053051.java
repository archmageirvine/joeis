package irvine.oeis.a053;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053051 Smallest integer m such that sum_(k=1 to m) d(k) is divisible by n, where d(k) (A000005) is the number of divisors of k.
 * @author Sean A. Irvine
 */
public class A053051 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long m = 0;
    long sum = 0;
    do {
      sum += Jaguar.factor(++m).sigma0AsLong();
      sum %= mN;
    } while (sum != 0);
    return Z.valueOf(m);
  }
}
