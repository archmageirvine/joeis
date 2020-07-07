package irvine.oeis.a033;

import java.util.Collections;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a000.A000290;

/**
 * A033454 Reversion of e.g.f. for squares <code>A000290</code>.
 * @author Sean A. Irvine
 */
public class A033454 extends A000290 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mA = RING.create(Collections.emptyList());
  private Z mF = Z.ONE;
  {
    mA.add(new Q(super.next()));
  }

  @Override
  public Z next() {
    final int n = mA.size();
    mA.add(new Q(super.next(), mF));
    if (n > 1) {
      mF = mF.multiply(n);
    }
    return RING.reversion(mA, n).coeff(n).multiply(mF).toZ();
  }
}

