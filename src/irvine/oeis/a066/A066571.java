package irvine.oeis.a066;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000009;
import irvine.oeis.memory.MemorySequence;

/**
 * A066571 Number of sets of positive integers with arithmetic mean n.
 * @author Sean A. Irvine
 */
public class A066571 extends Sequence1 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Polynomial<Z> mA = RING.one();
  private final MemorySequence mB = MemorySequence.cachedSequence(new A000009());
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = RING.multiply(mA, RING.onePlusXToTheN(mN - 1));
    }
    return Integers.SINGLETON.sum(0, mN * (mN - 1) / 2, k -> mA.coeff(k).multiply(mB.a(k))).multiply2().subtract(1);
  }
}

