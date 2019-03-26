package irvine.oeis.a019;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019555.
 * @author Sean A. Irvine
 */
public class A019555 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(++mN);
    Z res = Z.ONE;
    for (final Z p : fs.toZArray()) {
      res = res.multiply(p.pow((fs.getExponent(p) + 2) / 3));
    }
    return res;
  }
}
