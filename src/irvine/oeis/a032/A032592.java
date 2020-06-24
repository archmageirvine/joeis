package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A032592 Initial terms of <code>'4-block'</code> primes as described in <code>A032591</code>.
 * @author Sean A. Irvine
 */
public class A032592 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.mod(10) != 1) {
        continue;
      }
      final Z p1 = mFast.nextPrime(p);
      if (p1.mod(10) != 3) {
        continue;
      }
      final Z p2 = mFast.nextPrime(p1);
      if (p2.mod(10) != 7) {
        continue;
      }
      final Z p3 = mFast.nextPrime(p2);
      if (p3.mod(10) != 9) {
        continue;
      }
      return p;
    }
  }
}
