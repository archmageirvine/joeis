package irvine.oeis.a006;

import java.util.ArrayList;
import java.util.List;

import irvine.math.group.PolynomialRingField;
import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a003.A003426;

/**
 * A006544 Number of stable forests with n nodes.
 * @author Sean A. Irvine
 */
public class A006544 extends A003426 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private final List<Q> mS = new ArrayList<>();
  {
    mS.add(Q.ZERO);
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mS.add(new Q(super.next()));
    final Polynomial<Q> s = RING.create(mS);
    Q r = Q.ZERO;
    for (int k = 1; k <= mN; ++k) {
      r = r.add(SymmetricGroup.create(k).cycleIndex().apply(s, mN).coeff(mN));
    }
    return r.toZ();
  }
}
