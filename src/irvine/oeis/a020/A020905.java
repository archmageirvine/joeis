package irvine.oeis.a020;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020905 Sum of n plus its prime factors associated with A020700.
 * @author Sean A. Irvine
 */
public class A020905 implements Sequence {

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
        return t.add(1);
      }
    }
  }
}
