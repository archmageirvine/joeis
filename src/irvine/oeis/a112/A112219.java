package irvine.oeis.a112;

import java.util.Collections;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a058.A058705;

/**
 * A112219 McKay-Thompson series of class 104A for the Monster group.
 * @author Sean A. Irvine
 */
public class A112219 extends A058705 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mT = RING.create(Collections.emptyList());
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    mT.add(new Q(super.next()));
    final Polynomial<Q> c = RING.sqrt(mT, mN);
    return c.coeff(mN).toZ();
  }
}
