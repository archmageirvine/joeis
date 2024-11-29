package irvine.oeis.a073;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a072.A072964;

/**
 * A073420 G.f.: 1/B(x) where B(x) = g.f. for A072964.
 * @author Sean A. Irvine
 */
public class A073420 extends A072964 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Polynomial<Z> mB = RING.empty();
  private int mN = -1;

  @Override
  public Z next() {
    mB.add(super.next());
    return RING.coeff(RING.one(), mB, ++mN);
  }
}

