package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001237 Differences of reciprocals of unity.
 * @author Sean A. Irvine
 */
public class A001237 extends Sequence1 {

  private int mN = 1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    final Z y = mF.pow(4);
    Z s = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      final Z t = y.multiply(Binomial.binomial(mN, k)).divide(Z.valueOf(k).pow(4));
      s = s.signedAdd((k & 1) == 1, t);
    }
    return s;
  }
}
