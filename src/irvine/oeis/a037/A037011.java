package irvine.oeis.a037;

import irvine.math.group.GaloisField;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A037011 Baum-Sweet cubic sequence.
 * @author Sean A. Irvine
 */
public class A037011 extends Sequence1 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(new GaloisField(2));
  private Polynomial<Z> mA = RING.zero();
  private int mN = 0;

  @Override
  public Z next() {
    mA = RING.add(RING.x(), RING.pow(mA, 3, mN++).shift(1));
    return mA.coeff(mN);
  }
}
