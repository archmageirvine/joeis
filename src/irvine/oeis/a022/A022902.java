package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022902 Number of solutions to <code>c(1)*prime(3)+...+c(n)*prime(n+2) = 2</code>, where <code>c(i) = +-1</code> for <code>i&gt;1, c(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A022902 extends A022900 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(3L, ++mN);
  }
}
