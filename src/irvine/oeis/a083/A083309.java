package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.a022.A022897;

/**
 * A083309 a(n) is the number of times that sums 3+-5+-7+-11+-...+-prime(2n+1) of the first 2n odd primes is zero. There are 2^(2n-1) choices for the sign patterns.
 * @author Sean A. Irvine
 */
public class A083309 extends A022897 {

  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    return get(3L, mN);
  }
}
