package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A025475 1 and the prime powers p^m where m &gt;= 2, thus excluding the primes.
 * @author Sean A. Irvine
 */
public class A025475 extends A000961 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!t.isProbablePrime()) {
        return t;
      }
    }
  }
}

