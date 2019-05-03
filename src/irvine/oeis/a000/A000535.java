package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000535 Card matching: coefficients <code>B[n,2]</code> of <code>t^2</code> in the reduced hit polynomial <code>A[n,n,n](t)</code>.
 * @author Sean A. Irvine
 */
public class A000535 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    Z t = Z.ZERO;
    for (int k = 0; k < mN - 1; ++k) {
      s = s.add(Binomial.binomial(mN, k + 2)
                .multiply(Binomial.binomial(mN, k))
                .multiply(Binomial.binomial(mN - 2, k)));
      t = t.add(Binomial.binomial(mN, k + 1)
                .multiply(Binomial.binomial(mN - 1, k + 1))
                .multiply(Binomial.binomial(mN - 1, k)));
    }
    s = s.multiply(Binomial.binomial(mN, 2)).multiply(3);
    t = t.multiply(mN * (long) mN).multiply(3);
    return s.add(t);
  }
}
