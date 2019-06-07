package irvine.oeis.a011;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011788 Number of <code>n X n</code> matrices whose determinant is <code>1 mod n</code>.
 * @author Sean A. Irvine
 */
public class A011788 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    final FactorSequence fs = Cheetah.factor(mN);
    Z num = Z.ONE;
    Z den = Z.ONE;
    for (final Z p : fs.toZArray()) {
      Z pp = Z.ONE;
      for (int k = 1; k <= mN; ++k) {
        pp = pp.multiply(p);
        num = num.multiply(pp.subtract(1));
        den = den.multiply(pp);
      }
    }
    return num.multiply(Z.valueOf(mN).pow(mN * mN)).divide(den).divide(fs.phi());
  }
}
