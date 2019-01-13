package irvine.oeis.a002;

import java.util.ArrayList;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002073.
 * @author Sean A. Irvine
 */
public class A002073 implements Sequence {

  private static final PolynomialRingField<Q> FIELD = new PolynomialRingField<>(Rationals.SINGLETON);

  private final ArrayList<Q> mC = new ArrayList<>();
  private int mN = 0;

  protected Z answer(final Q v) {
    return v.num();
  }

  @Override
  public Z next() {
    ++mN;
    mC.add(new Q(3, 2 * mN + 1));
    mC.add(Q.ZERO);
    final Polynomial<Q> f = FIELD.pow(FIELD.create(mC), Q.ONE_THIRD, 2 * mN);
    final Polynomial<Q> gf = FIELD.reversion(f.shift(1), 2 * mN);
    return answer(gf.coeff(2 * mN - 1).multiply(2 * mN - 1));
  }
}
