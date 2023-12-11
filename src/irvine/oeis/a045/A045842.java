package irvine.oeis.a045;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a001.A001156;
import irvine.oeis.memory.MemorySequence;

/**
 * A045842 Expansion of Product_{k&gt;=0} 1/(1 - x^(k+1))^A001156(k).
 * @author Sean A. Irvine
 */
public class A045842 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final MemorySequence mA = MemorySequence.cachedSequence(new A001156());
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> prod = RING.one();
    for (int k = 1; k <= mN; ++k) {
      prod = RING.multiply(prod, RING.pow(RING.oneMinusXToTheN(k), mA.a(k - 1), mN), mN);
    }
    return RING.coeff(RING.one(), prod, mN);
  }
}

