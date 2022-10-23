package irvine.oeis.a020;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020700 Numbers k such that k + sum of its prime factors = (k+1) + sum of its prime factors.
 * @author Sean A. Irvine
 */
public class A020700 extends Sequence1 {

  private Z mPrev = Z.ZERO;
  private long mN = 6;

  @Override
  public Z next() {
    while (true) {
      final Z t = mPrev;
      mPrev = Z.valueOf(mN);
      final FactorSequence fs = Jaguar.factor(++mN);
      for (final Z p : fs.toZArray()) {
        mPrev = mPrev.add(p.multiply(fs.getExponent(p)));
      }
      if (t.equals(mPrev)) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}
