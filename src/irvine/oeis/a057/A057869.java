package irvine.oeis.a057;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057869 Triangle of coefficients of x^2 in the Neumann polynomials.
 * @author Sean A. Irvine
 */
public class A057869 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private Polynomial<Z> mA = null;
  private Polynomial<Z> mB = RING.one();
  private int mM = -2;
  private int mN = 2;

  @Override
  public Z next() {
    mM += 2;
    if (mM > mB.degree()) {
      if (mA == null) {
        mA = RING.one();
      } else if (mB.equals(RING.one())) {
        mB = Polynomial.create(4, 0, 1);
      } else {
        ++mN;
        Polynomial<Z> t = RING.subtract(RING.multiply(mB, Z.valueOf(2L * mN * (mN - 2))), RING.multiply(mA.shift(2), Z.valueOf(mN)));
        if ((mN & 1) == 0) {
          t = RING.add(t, RING.monomial(Z.valueOf(2L * (mN - 1)), mN));
        }
        mA = mB;
        mB = RING.divide(t, Z.valueOf(mN - 2));
      }
      mM = 0;
    }
    return mB.coeff(mM);
  }
}

