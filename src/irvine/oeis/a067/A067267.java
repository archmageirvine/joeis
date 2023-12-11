package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067267 Numbers n such that n, 10*n+1, 10*n+3, 10*n+7 and 10*n+9 are all primes.
 * @author Sean A. Irvine
 */
public class A067267 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z p10 = p.multiply(10);
      if (p10.add(1).isProbablePrime() && p10.add(3).isProbablePrime() && p10.add(7).isProbablePrime() && p10.add(9).isProbablePrime()) {
        return p;
      }
    }
  }
}

