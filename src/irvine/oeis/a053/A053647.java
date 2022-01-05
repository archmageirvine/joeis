package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A053647 First term of first sequence of n primes in arithmetic progression with a common difference equal to the product of first n primes.
 * @author Sean A. Irvine
 */
public class A053647 extends A002110 {

  private int mN = 0;
  {
    super.next();
  }

  private boolean is(final Z p, final Z delta, final int n) {
    Z q = p;
    for (int k = 1; k < n; ++k) {
      q = q.add(delta);
      if (!q.isProbablePrime()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    final Z delta = super.next();
    Z p = Z.ONE;
    while (true) {
      p = mPrime.nextPrime(p);
      if (is(p, delta, mN)) {
        return p;
      }
    }
  }
}
