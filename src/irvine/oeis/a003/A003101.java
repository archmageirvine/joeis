package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003101 a(n) = Sum_{k = 1..n} (n - k + 1)^k.
 * @author Sean A. Irvine
 */
public class A003101 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      s = s.add(Z.valueOf(mN - k + 1).pow(k));
    }
    return s;
  }
}
