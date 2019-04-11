package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007947 Largest squarefree number dividing n: the squarefree kernel of <code>n,</code> rad(n), radical of n.
 * @author Sean A. Irvine
 */
public class A007947 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    long p = 1;
    final FactorSequence fs = Cheetah.factor(++mN);
    for (final Z d : fs.toZArray()) {
      p *= d.longValue();
    }
    return Z.valueOf(p);
  }
}
