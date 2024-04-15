package irvine.oeis.a053;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053051 Smallest integer m such that sum_(k=1 to m) d(k) is divisible by n, where d(k) (A000005) is the number of divisors of k.
 * @author Sean A. Irvine
 */
public class A053051 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long m = 0;
    long sum = 0;
    do {
      sum += Functions.SIGMA0.l(++m);
      sum %= mN;
    } while (sum != 0);
    return Z.valueOf(m);
  }
}
