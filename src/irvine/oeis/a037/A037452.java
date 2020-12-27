package irvine.oeis.a037;

import java.util.ArrayList;
import java.util.List;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000293;

/**
 * A037452.
 * @author Sean A. Irvine
 */
public class A037452 extends A000293 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Polynomial<Z> mF = RING.empty();
  private final List<Z> mS = new ArrayList<>();
  private int mN = -1;

  private Polynomial<Z> prod(final int n) {
    Polynomial<Z> prod = RING.one();
    for (int k = 0; k < mS.size(); ++k) {
      prod = RING.multiply(prod, RING.pow(RING.oneMinusXToTheN(k + 1), mS.get(k), n), n);
    }
    return prod;
  }

  @Override
  public Z next() {
    mF.add(super.next());
    if (++mN == 0) {
      return Z.ZERO;
    } else {
      final Polynomial<Z> t = RING.multiply(mF, prod(mN), mN);
      final Z c = t.coeff(mN);
      mS.add(c);
      return c;
    }
  }
}
