package irvine.oeis.a067;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067081.
 * @author Sean A. Irvine
 */
public class A067146 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mGf = RING.empty();
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      mGf.add(Q.ZERO);
      mGf.add(Q.ONE);
      return Z.ONE;
    } else {
      final Q coeff = RING.reversion(mGf, mN).coeff(mN - 1);
      mGf.add(coeff.divide(mN));
      return coeff.multiply(MemoryFactorial.SINGLETON.factorial(mN - 1)).toZ();
    }
  }
}
