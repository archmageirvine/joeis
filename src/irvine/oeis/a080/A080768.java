package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A080768 A unitary phi reciprocal amicable number: consider two different numbers a, b which satisfy the following equation for some integer k: uphi(a)=uphi(b)=1/k*a*b/(a-b); or equivalently, 1/uphi(a)=1/uphi(b)=k*(-1/a+1/b); sequence gives k numbers.
 * @author Sean A. Irvine
 */
public class A080768 extends A080766 {

  @Override
  protected Z select(final long n, final long m) {
    return Z.valueOf(n).multiply(m).divide(n - m).divide(Functions.UPHI.l(n));
  }
}
