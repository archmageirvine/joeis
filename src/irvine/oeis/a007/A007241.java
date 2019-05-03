package irvine.oeis.a007;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007241 McKay-Thompson series of class <code>2A</code> for the Monster group with <code>a(0) = 24</code>.
 * @author Sean A. Irvine
 */
public class A007241 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> B = Polynomial.create(0, 0, 4096);
  private static final Polynomial<Z> C = Polynomial.create(0, 48);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> a = RING.one();
    for (int k = 1; k <= (mN + 1) / 2; ++k) {
      a = RING.multiply(a, RING.oneMinusXToTheN(2 * k - 1), mN);
    }
    a = RING.pow(a, 24, mN);
    a = RING.add(RING.add(a, C), RING.series(B, a, mN));
    return a.coeff(mN);
  }
}
