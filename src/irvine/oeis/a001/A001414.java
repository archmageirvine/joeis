package irvine.oeis.a001;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001414.
 * @author Sean A. Irvine
 */
public class A001414 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    final FactorSequence fs = Cheetah.factor(mN);
    Z s = Z.ZERO;
    for (final Z z : fs.toZArray()) {
      s = s.add(z.multiply(fs.getExponent(z)));
    }
    return s;
  }
}
