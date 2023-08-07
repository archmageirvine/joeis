package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A065022 Composite n such that the sums of the composite numbers up to n, +/- 1, are twin primes.
 * @author Sean A. Irvine
 */
public class A065022 extends A002808 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      mSum = mSum.add(c);
      if (mSum.subtract(1).isProbablePrime() && mSum.add(1).isProbablePrime()) {
        return c;
      }
    }
  }
}

