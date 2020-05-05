package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A031924 Primes followed by a gap of 6, i.e., next prime is p <code>+ 6</code>.
 * @author Sean A. Irvine
 */
public class A031924 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.nextPrime(p).equals(p.add(6))) {
        return p;
      }
    }
  }
}
