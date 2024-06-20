package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A046951 a(n) is the number of squares dividing n.
 * @author Sean A. Irvine
 */
public class A046951 extends Sequence1 implements DirectSequence {

  private int mN = 0;

  @Override
  public Z next() {
    return a(Z.valueOf(++mN));
  }

  @Override
  public Z a(final Z n) {
    Z res = Z.ONE;
    if (n.compareTo(Z.ONE) > 0) {
      final FactorSequence fs = Jaguar.factor(n);
      for (final Z p : fs.toZArray()) {
        res = res.multiply(fs.getExponent(p) / 2 + 1);
      }
    }
    return res;
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

}
