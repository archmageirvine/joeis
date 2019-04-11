package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.a000.A000043;

/**
 * A019280 Let sigma_m(n) be result of applying the sum-of-divisors function m times to n; call n (m,k)-perfect if sigma_m(n) = k*n; sequence gives log_2 of the <code>(2</code>,2)-perfect numbers.
 * @author Sean A. Irvine
 */
public class A019280 extends A000043 {

  // Conjectural -- do not use this to extend the sequence

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}

