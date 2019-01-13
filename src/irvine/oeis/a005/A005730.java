package irvine.oeis.a005;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005730.
 * @author Sean A. Irvine
 */
public class A005730 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final FactorSequence fs = Cheetah.factor(mN);
    if (fs.omega() == 1 && fs.bigOmega() == 1) {
      return Z.ONE;
    }
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(p);
    }
    for (long j = 4; 2 * (j - 1) <= mN; j <<= 1) {
      if (mN % (2 * (j - 1)) == 0) {
        return prod.multiply2();
      }
    }
    return prod;
  }
}
