package irvine.oeis.a019;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019554 Smallest number whose square is divisible by <code>n</code>.
 * @author Sean A. Irvine
 */
public class A019554 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(++mN);
    Z res = Z.ONE;
    for (final Z p : fs.toZArray()) {
      res = res.multiply(p.pow((fs.getExponent(p) + 1) / 2));
    }
    return res;
  }
}
