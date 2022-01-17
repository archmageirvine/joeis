package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a007.A007504;

/**
 * A053790 Composite numbers arising as sum of first k primes.
 * @author Sean A. Irvine
 */
public class A053790 extends A007504 {

  {
    next(); // skip 0
  }

  @Override
  public Z next() {
    while (true) {
      final Z sum = super.next();
      if (!sum.isProbablePrime()) {
        return sum;
      }
    }
  }
}
