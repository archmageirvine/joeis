package irvine.oeis.a052;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a025.A025487;

/**
 * A052304 Number of squares dividing A025487(n).
 * @author Sean A. Irvine
 */
public class A052304 extends A025487 {

  @Override
  public Z next() {
    Z res = Z.ONE;
    final FactorSequence fs = Cheetah.factor(super.next());
    for (final Z p : fs.toZArray()) {
      res = res.multiply(fs.getExponent(p) / 2 + 1);
    }
    return res;
  }
}
