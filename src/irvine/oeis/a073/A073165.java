package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073165 Triangle T(n,k) read by rows: related to David G. Cantor's sigma function.
 * @author Sean A. Irvine
 */
public class A073165 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    Z a = Z.ONE;
    Z b = Z.ONE;
    for (long k = 1; k <= mM; ++k) {
      for (long j = 1; j <= k; ++j) {
        a = a.multiply(mN - mM + k + j - 1);
        b = b.multiply(k + j - 1);
      }
    }
    return a.divide(b);
  }
}
