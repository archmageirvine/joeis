package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022903 Number of solutions to <code>c(1)*prime(4) + ... + c(n)*prime(n+3) = 0</code>, where <code>c(i) = +-1</code> for <code>i&gt;1, c(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A022903 extends A022894 {

  private long mN = 0;

  @Override
  protected long start() {
    return 6;
  }

  @Override
  public Z next() {
    return get(7L, ++mN);
  }
}
