package irvine.oeis.a023;

import java.util.Collections;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a002.A002126;

/**
 * A023901 Derivative of log of A002126.
 * @author Sean A. Irvine
 */
public class A023901 extends A002126 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mG = RING.create(Collections.singletonList(new Q(super.next())));
  private int mN = 0;

  @Override
  public Z next() {
    mG.add(new Q(super.next()));
    return RING.diff(RING.log(mG, ++mN)).coeff(mN - 1).toZ();
  }
}

