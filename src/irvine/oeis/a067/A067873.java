package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067873 Numbers x satisfying x^2 - D*y^2 = 1 for more than one value of D distinct from x^2 - 1.
 * @author Sean A. Irvine
 */
public class A067873 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.valueOf(++mN).square().subtract(1);
      final FactorSequence fs = Jaguar.factor(t);
      final Z f = t.divide(fs.core()).sqrt();
      if (f.compareTo(Z.ONE) > 0 && !f.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
