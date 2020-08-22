package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022902 Number of solutions to c(1)*prime(3)+...+c(n)*prime(n+2) = 2, where c(i) = +-1 for i&gt;1, c(1) = 1.
 * @author Sean A. Irvine
 */
public class A022902 extends A022900 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(3L, ++mN);
  }
}
