package irvine.oeis.a020;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020700 Sum of n plus its prime factors = sum of <code>n+1</code> plus its prime factors.
 * @author Sean A. Irvine
 */
public class A020700 implements Sequence {

  private Z mPrev = Z.ZERO;
  private long mN = 6;

  @Override
  public Z next() {
    while (true) {
      final Z t = mPrev;
      mPrev = Z.valueOf(mN);
      final FactorSequence fs = Cheetah.factor(++mN);
      for (final Z p : fs.toZArray()) {
        mPrev = mPrev.add(p.multiply(fs.getExponent(p)));
      }
      if (t.equals(mPrev)) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}
