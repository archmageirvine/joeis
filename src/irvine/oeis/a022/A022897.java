package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022897 Number of solutions to <code>c(1)*prime(2) +...+ c(n)*prime(n+1) = 0</code>, where <code>c(i) = +-1</code> for <code>i&gt;1, c(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A022897 extends A022894 {

  private long mN = 0;

  @Override
  protected long start() {
    return 2;
  }

  @Override
  public Z next() {
    return get(3L, ++mN);
  }
}
