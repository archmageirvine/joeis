package irvine.oeis.a037;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000055;

/**
 * A037247 Reversion of g.f. (beginning with x term) for number of trees with n nodes.
 * @author Sean A. Irvine
 */
public class A037247 extends A000055 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  private final Polynomial<Z> mP = RING.empty();
  private int mN = 0;
  {
    mP.add(Z.ZERO);
    super.next();
  }

  @Override
  public Z next() {
    ++mN;
    mP.add(super.next());
    return RING.reversion(mP, mN).coeff(mN);
  }
}

