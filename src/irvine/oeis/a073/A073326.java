package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;

/**
 * A073326 Smallest x such that prime(x) == n (mod (x-pi(x)-1)).
 * @author Sean A. Irvine
 */
public class A073326 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Sequence primes = new A000040().skip(3);
    long k = 3;
    while (true) {
      ++k;
      if (primes.next().mod(k - Functions.PRIME_PI.l(k) - 1) == mN) {
        return Z.valueOf(k);
      }
    }
  }
}

