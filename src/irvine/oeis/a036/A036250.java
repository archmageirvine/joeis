package irvine.oeis.a036;

import java.util.Collections;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A036250 Number of trees of nonempty sets with n points. (Each node is a set of 1 or more points.).
 * @author Sean A. Irvine
 */
public class A036250 extends A036249 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final Polynomial<Z> mB = RING.create(Collections.emptyList());
  private int mN = -1;

  @Override
  public Z next() {
    mB.add(super.next());
    return ++mN == 0 ? Z.ONE : mB.substitutePower(2, mN).coeff(mN)
      .subtract(RING.pow(mB, 2, mN).coeff(mN))
      .divide2()
      .add(mB.coeff(mN));
  }
}

