package irvine.oeis.a005;

import java.util.ArrayList;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000009;

/**
 * A005896.
 * @author Sean A. Irvine
 */
public class A005896 extends A000009 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final ArrayList<Z> mP = new ArrayList<>();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    mP.add(super.next());
    final Polynomial<Z> gfp = RING.create(mP);
    Polynomial<Z> sum = RING.zero();
    Polynomial<Z> d = RING.one();
    for (int k = 0; k <= mN; ++k) {
      d = RING.multiply(d, RING.oneMinusXToTheN(2 * k + 1), mN);
      sum = RING.add(sum, RING.subtract(gfp, RING.series(RING.one(), d, mN)));
    }
    return sum.coeff(mN);
  }
}
