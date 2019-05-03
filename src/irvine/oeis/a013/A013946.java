package irvine.oeis.a013;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013946 Least d for which the number with continued fraction <code>[n,n,n,n...]</code> is in <code>Q(sqrt(d))</code>.
 * @author Sean A. Irvine
 */
public class A013946 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final Z m = Z.valueOf(++mN).square().add(4);
    final FactorSequence fs = Cheetah.factor(m);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      if ((fs.getExponent(p) & 1) == 1) {
        prod = prod.multiply(p);
      }
    }
    return prod;
  }
}
