package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022899 Number of solutions to <code>c(1)*prime(2) +</code> ... <code>+ c(n)*prime(n+1) = 2</code>, where <code>c(i) = +-1</code> for <code>i&gt;1, c(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A022899 extends A022897 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(1L, ++mN);
  }
}
