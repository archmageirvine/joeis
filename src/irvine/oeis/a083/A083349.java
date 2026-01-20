package irvine.oeis.a083;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.DynamicArray;

/**
 * A083349 Least positive integers not appearing previously such that the self-convolution cube-root of this sequence consists entirely of integers.
 * @author Sean A. Irvine
 */
public class A083349 extends Sequence0 {

  protected int mN = -1;
  protected static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  protected final Polynomial<Q> mA = Polynomial.create(Q.ONE, Q.THREE);
  private final DynamicArray<Z> mP = new DynamicArray<>();
  {
    mP.set(1, Z.ONE);
    mP.set(3, Z.TWO);
  }

  @Override
  public Z next() {
    if (++mN > mA.degree()) {
      for (int k = 2; k < 3 * (mN + 1); ++k) {
        if (mP.get(k) == null) {
          final Polynomial<Q> f = PolynomialUtils.cubeRootP(RING.add(RING.subtract(mA, RING.one()), RING.monomial(Q.valueOf(k), mN)), mN);
          final Q t = f.coeff(mN);
          if (t.isInteger()) {
            mP.set(k, Z.valueOf(mN + 1));
            mA.add(Q.valueOf(k));
            break;
          }
        }
      }
    }
    return mA.coeff(mN).toZ();
  }
}
