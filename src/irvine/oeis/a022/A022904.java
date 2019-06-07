package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022904 Number of solutions to <code>c(1)*prime(4) + ... + c(n)*prime(n+3) = 1</code>, where <code>c(i) = +-1</code> for <code>i&gt;1, c(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A022904 extends A022903 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(6L, ++mN);
  }
}
