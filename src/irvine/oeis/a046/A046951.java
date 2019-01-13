package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046951.
 * @author Sean A. Irvine
 */
public class A046951 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z res = Z.ONE;
    if (++mN > 1) {
      final FactorSequence fs = Cheetah.factor(mN);
      for (final Z p : fs.toZArray()) {
        res = res.multiply(fs.getExponent(p) / 2 + 1);
      }
    }
    return res;
  }
}
