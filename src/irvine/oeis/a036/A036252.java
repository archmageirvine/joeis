package irvine.oeis.a036;

import java.util.Collections;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a029.A029857;

/**
 * A036252 Number of trees with 3-colored leaves.
 * @author Sean A. Irvine
 */
public class A036252 extends A029857 {

  private final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final Polynomial<Z> mB = RING.create(Collections.emptyList());
  private final Polynomial<Z> mB2 = RING.create(Collections.emptyList());
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      mB.add(Z.ZERO);
      mB2.add(Z.ZERO);
      return Z.ONE;
    } else {
      final Z t = super.next();
      mB.add(t);
      mB2.add(mN == 1 ? t.subtract(2) : t);
    }
    return mB.substitutePower(2, mN).coeff(mN)
      .add(RING.pow(mB, 2, mN).coeff(mN))
      .divide2()
      .subtract(RING.multiply(mB, mB2, mN).coeff(mN))
      .add(mB.coeff(mN));
  }
}

