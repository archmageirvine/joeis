package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003101 <code>a(n) =</code> Sum_{k <code>= 1..n} (n - k + 1)^k</code>.
 * @author Sean A. Irvine
 */
public class A003101 implements Sequence {

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
