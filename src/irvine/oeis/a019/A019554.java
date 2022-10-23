package irvine.oeis.a019;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A019554 Smallest number whose square is divisible by n.
 * @author Sean A. Irvine
 */
public class A019554 extends Sequence1 {

  protected long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z res = Z.ONE;
    for (final Z p : fs.toZArray()) {
      res = res.multiply(p.pow((fs.getExponent(p) + 1) / 2));
    }
    return res;
  }
}
