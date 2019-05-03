package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000489 Card matching: Coefficients <code>B[n,3]</code> of <code>t^3</code> in the reduced hit polynomial <code>A[n,n,n](t)</code>.
 * @author Sean A. Irvine
 */
public class A000489 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    Z t = Z.ZERO;
    Z u = Z.ZERO;
    for (int k = 0; k < mN - 2; ++k) {
      s = s.add(Binomial.binomial(mN, k + 3)
                .multiply(Binomial.binomial(mN, k))
                .multiply(Binomial.binomial(mN - 3, k)));
      t = t.add(Binomial.binomial(mN, k + 1)
                .multiply(Binomial.binomial(mN - 1, k + 2))
                .multiply(Binomial.binomial(mN - 2, k)));
    }
    s = s.multiply(Binomial.binomial(mN, 3)).multiply(3);
    t = t.multiply(Binomial.binomial(mN, 2)).multiply(mN).multiply(6);
    for (int k = 0; k < mN; ++k) {
      u = u.add(Binomial.binomial(mN - 1, k).pow(3));
    }
    u = u.multiply(mN).multiply(mN).multiply(mN);
    return s.add(t).add(u);
  }
}
