package irvine.oeis.a389;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A389333 allocated for Robert Israel.
 * @author Sean A. Irvine
 */
public class A389333 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      Z sum = p;
      Z prod = p;
      Z q = p;
      for (long k = 1; k < 4; ++k) {
        q = mPrime.nextPrime(q);
        sum = sum.add(q);
        prod = prod.multiply(q);
      }
      sum = sum.pow(4);
      if (sum.add(prod).isProbablePrime() && sum.subtract(prod).isProbablePrime()) {
        return p;
      }
    }
  }
}
