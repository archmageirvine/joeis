package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a002.A002808;

/**
 * A075064 Smallest composite number == 1 mod first n prime numbers.
 * @author Sean A. Irvine
 */
public class A075064 extends A002808 {

  private int mN = 0;
  private Z mC = super.next();

  private boolean is(final Z c, final int n) {
    final Sequence primes = new A000040();
    for (int k = 0; k < n; ++k) {
      if (!c.mod(primes.next()).isOne()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (!is(mC, mN)) {
      mC = super.next();
    }
    return mC;
  }
}

