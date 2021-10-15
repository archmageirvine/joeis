package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A052013 Primes that are congruent to -1 mod n, where n is the index of the prime.
 * @author Sean A. Irvine
 */
public class A052013 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mN == p.mod(++mN)) {
        return p;
      }
    }
  }
}
