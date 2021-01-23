package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000180 E.g.f. exp(-x)/(1-3x).
 * @author Sean A. Irvine
 */
public class A000180 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z f = Z.ONE;
    Z s = Z.ZERO;
    boolean sign = (mN & 1) == 0;
    for (long k = 0; k <= mN; ++k) {
      if (k > 0) {
        f = f.multiply(k).multiply(3);
      }
      final Z t = f.multiply(Binomial.binomial(mN, k));
      s = s.signedAdd(sign, t);
      sign = !sign;
    }
    return s;
  }
}

