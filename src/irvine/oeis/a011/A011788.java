package irvine.oeis.a011;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A011788 Number of n X n matrices whose determinant is 1 mod n.
 * @author Sean A. Irvine
 */
public class A011788 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    final FactorSequence fs = Jaguar.factor(mN);
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
    return num.multiply(Z.valueOf(mN).pow((long) mN * mN)).divide(den).divide(fs.phi());
  }
}
