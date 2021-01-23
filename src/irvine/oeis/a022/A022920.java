package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022920 Number of solutions to c(1)*prime(4) + ... + c(n)*prime(n+3) = 2, where c(i) = +-1 for i &gt; 1, c(1) = 1.
 * @author Sean A. Irvine
 */
public class A022920 extends A022903 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(5L, ++mN);
  }
}
