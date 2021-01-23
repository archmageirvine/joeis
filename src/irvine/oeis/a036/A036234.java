package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A036234 Number of primes &lt;= n, if 1 is counted as a prime.
 * @author Sean A. Irvine
 */
public class A036234 extends A000720 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}

