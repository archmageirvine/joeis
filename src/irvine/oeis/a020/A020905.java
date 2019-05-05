package irvine.oeis.a020;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020905.
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
      final FactorSequence fs = Cheetah.factor(++mN);
      for (final Z p : fs.toZArray()) {
        mPrev = mPrev.add(p.multiply(fs.getExponent(p)));
      }
      if (t.equals(mPrev)) {
        return t.add(1);
      }
    }
  }
}
