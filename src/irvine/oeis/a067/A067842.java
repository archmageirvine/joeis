package irvine.oeis.a067;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a007.A007097;
import irvine.oeis.memory.MemorySequence;

/**
 * A067842 Expansion of 1/Product_{k=1..infinity} (1-x^A007097(k)).
 * @author Sean A. Irvine
 */
public class A067842 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final MemorySequence mA = MemorySequence.cachedSequence(new A007097());
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> f = RING.one();
    for (int k = 1; mA.a(k).intValueExact() <= mN; ++k) {
      f = RING.multiply(f, RING.oneMinusXToTheN(mA.a(k).intValueExact()), mN);
    }
    return RING.coeff(RING.one(), f, mN);
  }
}
