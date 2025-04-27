package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a024.A024450;

/**
 * A077023 Integer values of sum of first k primes squared divided by k-th prime, for some k (A077022).
 * @author Sean A. Irvine
 */
public class A077023 extends A024450 {

  private final Sequence mPrimes = new A000040();

  @Override
  public Z next() {
    while (true) {
      final Z s = super.next();
      final Z p = mPrimes.next();
      if (s.mod(p).isZero()) {
        return s.divide(p);
      }
    }
  }
}
