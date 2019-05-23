package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022895 Number of solutions to <code>c(1)*prime(1) +</code> ... <code>+ c(n)*prime(n) = 1</code>, where <code>c(i) = +-1</code> for i <code>&gt; 1, c(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A022895 extends A022894 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(1L, ++mN);
  }
}
