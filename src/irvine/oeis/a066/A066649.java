package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;

/**
 * A066649 Primes of the form a^2 + b^3 with a, b &gt; 0.
 * @author Sean A. Irvine
 */
public class A066649 extends Sequence1 {

  private final Sequence mPrimes = new A000040();

  private boolean is(final Z p) {
    long k = 0;
    Z c;
    while ((c = p.subtract(Z.valueOf(++k).pow(3))).signum() > 0) {
      if (c.isSquare()) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = mPrimes.next();
      if (is(p)) {
        return p;
      }
    }
  }
}
