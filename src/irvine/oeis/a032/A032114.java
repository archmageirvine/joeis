package irvine.oeis.a032;

import java.util.Collections;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a000.A000027;

/**
 * A032114 "BIJ" (reversible, indistinct, labeled) transform of 1,2,3,4...
 * @author Sean A. Irvine
 */
public class A032114 extends A000027 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mA = RING.create(Collections.emptyList());
  private Z mF = Z.ONE;
  private int mN = 0;
  {
    mA.add(Q.ZERO);
  }

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    mA.add(new Q(super.next(), mF));
    return A032113.bij(mA, mN).coeff(mN).multiply(mF).toZ();
  }
}
