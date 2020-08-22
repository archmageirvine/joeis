package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A028505 Number of primes &lt;= 100*n.
 * @author Sean A. Irvine
 */
public class A028505 extends A000720 {

  @Override
  public Z next() {
    for (int k = 0; k < 99; ++k) {
      super.next();
    }
    return super.next();
  }
}
