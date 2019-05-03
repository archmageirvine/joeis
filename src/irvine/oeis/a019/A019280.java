package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.a000.A000043;

/**
 * A019280 Let <code>sigma_m(n)</code> be result of applying the <code>sum-of-divisors</code> function m times to n; call <code>n (m,k)-perfect</code> if <code>sigma_m(n) = k*n</code>; sequence gives <code>log_2</code> of the <code>(2,2)-perfect</code> numbers.
 * @author Sean A. Irvine
 */
public class A019280 extends A000043 {

  // Conjectural -- do not use this to extend the sequence

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}

