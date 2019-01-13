package irvine.oeis.a002;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002104.
 * @author Sean A. Irvine
 */
public class A002104 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    Z f = Z.ONE;
    for (int k = 0; k < mN; ++k) {
      if (k > 1) {
        f = f.multiply(k);
      }
      s = s.add(Binomial.binomial(mN, mN - k - 1).multiply(f));
    }
    return s;
  }
}
