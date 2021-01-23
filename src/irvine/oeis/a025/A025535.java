package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025535 a(n) = (1/C(2n,0) - 1/C(2n,1) + ... + d/C(2n,2n))*L, where d = (-1)^2n, L = LCM{C(2n,0), C(2n,1),..., C(2n,2n)}.
 * @author Sean A. Irvine
 */
public class A025535 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z l = Z.ONE;
    for (long k = mN + 1; k <= 2 * mN + 1; ++k) {
      l = l.lcm(Z.valueOf(k));
    }
    return l.divide(mN + 1);
  }
}
