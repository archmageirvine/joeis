package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A080768 A unitary phi reciprocal amicable number: consider two different numbers r, s which satisfy the following equation for some integer k: uphi(r) = uphi(s) = (1/k) * r * s / (r-s); or equivalently, 1/uphi(r) = 1/uphi(s) = k * (1/s - 1/r); sequence gives k numbers.
 * @author Sean A. Irvine
 */
public class A080768 extends A080766 {

  @Override
  protected Z select(final long n, final long m) {
    return Z.valueOf(n).multiply(m).divide(n - m).divide(Functions.UPHI.l(n));
  }
}
