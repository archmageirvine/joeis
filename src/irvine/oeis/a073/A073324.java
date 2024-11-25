package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;
import irvine.oeis.a002.A002808;

/**
 * A073324 Smallest x such that prime(x) mod c(x) = n, where prime(j) is the j-th prime, c(j) is the j-th composite number.
 * @author Sean A. Irvine
 */
public class A073324 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Sequence primes = new A000040();
    final Sequence composites = new A002808();
    long k = 0;
    while (true) {
      ++k;
      if (primes.next().mod(composites.next()).longValueExact() == mN) {
        return Z.valueOf(k);
      }
    }
  }
}

