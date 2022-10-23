package irvine.oeis.a032;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A032173 Sequence (a(n): n &gt;= 1) that shifts left 2 places under the "CHK" (necklace, identity, unlabeled) transform and has initial terms a(1) = a(2) = 1.
 * @author Sean A. Irvine
 */
public class A032173 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C = RING.onePlusXToTheN(1);
  private Polynomial<Q> mA = RING.one();
  private int mN = -1;

  @Override
  public Z next() {
    mA = RING.add(C, A032171.chk(mA.shift(1), ++mN).shift(1));
    return mA.coeff(mN).toZ();
  }
}
