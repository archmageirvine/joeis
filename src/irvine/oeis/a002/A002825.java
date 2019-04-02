package irvine.oeis.a002;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002825 Number of precomplete Post functions.
 * @author Sean A. Irvine
 */
public class A002825 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      Z t = Z.ZERO;
      for (int j = 0; j <= k; ++j) {
        t = t.add(Z.ONE.shiftLeft(Binomial.binomial(k, j).intValueExact()));
      }
      s = s.signedAdd((k & 1) == 0, t.multiply(Binomial.binomial(mN, k)));
    }
    return s.abs().subtract(mN + 2).abs();
  }
}
