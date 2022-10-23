package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046951 a(n) is the number of squares dividing n.
 * @author Sean A. Irvine
 */
public class A046951 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z res = Z.ONE;
    if (++mN > 1) {
      final FactorSequence fs = Jaguar.factor(mN);
      for (final Z p : fs.toZArray()) {
        res = res.multiply(fs.getExponent(p) / 2 + 1);
      }
    }
    return res;
  }
}
