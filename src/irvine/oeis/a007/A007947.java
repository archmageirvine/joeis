package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007947 Largest squarefree number dividing n: the squarefree kernel of n, rad(n), radical of n.
 * @author Sean A. Irvine
 */
public class A007947 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z prod = Z.ONE;
    final FactorSequence fs = Cheetah.factor(++mN);
    for (final Z d : fs.toZArray()) {
      prod = prod.multiply(d);
    }
    return prod;
  }
}
