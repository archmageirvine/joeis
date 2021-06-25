package irvine.oeis.a048;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a000.A000720;
import irvine.oeis.a001.A001358;

/**
 * A048623 Binary encoding of semiprimes (A001358).
 * @author Sean A. Irvine
 */
public class A048623 extends A001358 {

  private final MemorySequence mPrimePi = MemorySequence.cachedSequence(new A000720());

  @Override
  public Z next() {
    final Z[] p = Cheetah.factor(super.next()).toZArray();
    if (p.length == 1) {
      return Z.ONE.shiftLeft(mPrimePi.a(p[0].intValueExact() - 1).intValueExact());
    } else {
      return Z.ONE.shiftLeft(mPrimePi.a(p[1].intValueExact() - 1).intValueExact() - 1)
        .or(Z.ONE.shiftLeft(mPrimePi.a(p[0].intValueExact() - 1).intValueExact() - 1));
    }
  }
}

