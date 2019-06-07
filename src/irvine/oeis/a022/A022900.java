package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022900 Number of solutions to <code>c(1)*prime(3) + ... + c(n)*prime(n+2) = 0</code>, where <code>c(i) = +-1</code> for <code>i&gt;1, c(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A022900 extends A022894 {

  private long mN = 0;

  @Override
  protected long start() {
    return 4;
  }

  @Override
  public Z next() {
    return get(5L, ++mN);
  }
}
