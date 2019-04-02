package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001908 E.g.f. exp(-x)/(1-5*x).
 * @author Sean A. Irvine
 */
public class A001908 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    Z f = Z.ONE;
    for (int k = 0; k <= mN; ++k) {
      if (k > 0) {
        f = f.multiply(5L * k);
      }
      final Z t = Binomial.binomial(mN, k).multiply(f);
      s = s.signedAdd(((mN + k) & 1) == 0, t);
    }
    return s;
  }
}
