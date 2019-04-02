package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001907 Expansion of e^(-x)/(1-4x).
 * @author Sean A. Irvine
 */
public class A001907 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    Z f = Z.ONE;
    for (int k = 0; k <= mN; ++k) {
      if (k > 0) {
        f = f.multiply(4L * k);
      }
      final Z t = Binomial.binomial(mN, k).multiply(f);
      s = s.signedAdd(((mN + k) & 1) == 0, t);
    }
    return s;
  }
}
