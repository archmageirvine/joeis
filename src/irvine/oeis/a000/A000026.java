package irvine.oeis.a000;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000026.
 * @author Sean A. Irvine
 */
public class A000026 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(++mN);
    Z prod = Z.ONE;
    for (final Z d : fs.toZArray()) {
      prod = prod.multiply(d).multiply(fs.getExponent(d));
    }
    return prod;
  }

}

