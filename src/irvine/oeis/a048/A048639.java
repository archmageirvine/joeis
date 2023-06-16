package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a000.A000720;
import irvine.oeis.a006.A006881;

/**
 * A048639 Binary encoding of A006881, numbers with two distinct prime divisors.
 * @author Sean A. Irvine
 */
public class A048639 extends A006881 {

  private final MemorySequence mPrimePi = MemorySequence.cachedSequence(new A000720());

  @Override
  public Z next() {
    final Z[] p = Jaguar.factor(super.next()).toZArray();
    return Z.ONE.shiftLeft(mPrimePi.a(p[1].intValueExact() - 1).longValueExact() - 1)
      .or(Z.ONE.shiftLeft(mPrimePi.a(p[0].intValueExact() - 1).longValueExact() - 1));
  }
}

