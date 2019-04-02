package irvine.oeis.a005;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005934 Highly powerful numbers.
 * @author Sean A. Irvine
 */
public class A005934 implements Sequence {

  private long mN = 0;
  private Z mBest = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      Z prod = Z.ONE;
      final FactorSequence fs = Cheetah.factor(++mN);
      for (final Z p : fs.toZArray()) {
        prod = prod.multiply(fs.getExponent(p));
      }
      if (prod.compareTo(mBest) > 0) {
        mBest = prod;
        return Z.valueOf(mN);
      }
    }
  }
}
