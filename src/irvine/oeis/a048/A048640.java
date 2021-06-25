package irvine.oeis.a048;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a000.A000720;
import irvine.oeis.a005.A005117;

/**
 * A048640 Binary encoding of the squarefree numbers, A005117.
 * @author Sean A. Irvine
 */
public class A048640 extends A005117 {

  private final MemorySequence mPrimePi = MemorySequence.cachedSequence(new A000720());

  @Override
  public Z next() {
    Z res = Z.ZERO;
    final Z t = super.next();
    if (Z.ONE.equals(t)) {
      return Z.ONE;
    }
    for (final Z p : Cheetah.factor(t).toZArray()) {
      res = res.or(Z.ONE.shiftLeft(mPrimePi.a(p.intValueExact() - 1).intValueExact()));
    }
    return res;
  }
}

