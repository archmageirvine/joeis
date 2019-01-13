package irvine.oeis.a005;

import java.util.ArrayList;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a002.A002293;

/**
 * A005039.
 * @author Sean A. Irvine
 */
public class A005039 extends A002293 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final ArrayList<Q> mU = new ArrayList<>();
  private int mN = -1;

  {
    mU.add(new Q(super.next()));
  }

  @Override
  public Z next() {
    ++mN;
    mU.add(new Q(super.next()));
    final Polynomial<Q> u = RING.create(mU);
    final Polynomial<Q> u2 = u.substitutePower(2, mN);
    final Q a = RING.pow(u, 5, mN).coeff(mN);
    final Q b = u.substitutePower(5, mN).coeff(mN).multiply(4);
    final Q c = RING.pow(u2, 2, mN).coeff(mN).multiply(5);
    final Q d = RING.pow(u2, 4, mN).shift(1).coeff(mN).multiply(5);
    return a.add(b).add(c).add(d).toZ().divide(10);
  }
}

