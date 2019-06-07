package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022920 Number of solutions to <code>c(1)*prime(4) + ... + c(n)*prime(n+3) = 2</code>, where <code>c(i) = +-1</code> for i <code>&gt; 1, c(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A022920 extends A022903 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(5L, ++mN);
  }
}
