package irvine.oeis.a028;

import java.util.Collections;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A028995 Theta series of <code>10-d 11-modular</code> Craig lattice <code>A_10^(3)</code>.
 * @author Sean A. Irvine
 */
public class A028995 extends A028609 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;
  private Polynomial<Z> mA028609 = RING.create(Collections.emptyList());

  @Override
  public Z next() {
    ++mN;
    mA028609.add(super.next());
    final Polynomial<Z> eta = RING.eta(RING.x(), mN);
    final Polynomial<Z> eta11 = eta.substitutePower(11, mN);
    final Polynomial<Z> t = RING.pow(RING.multiply(eta, eta11, mN), 2, mN).shift(1);
    return RING.subtract(RING.pow(mA028609, 5, mN),
      RING.multiply(RING.multiply(RING.pow(mA028609, 3, mN), t, mN), Z.TEN)).coeff(mN);
  }
}
