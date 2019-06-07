package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022896 Number of solutions to <code>c(1)*prime(1) + ... + c(n)*prime(n) = 2</code>, where <code>c(i) = +-1</code> for <code>i&gt;1, c(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A022896 extends A022894 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(0L, ++mN);
  }
}
