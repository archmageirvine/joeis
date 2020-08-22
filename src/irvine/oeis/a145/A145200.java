package irvine.oeis.a145;

import java.util.Collections;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000521;
import irvine.oeis.a013.A013973;
import irvine.oeis.a282.A282019;

/**
 * A145200 Coefficients of expansion of Phi(tau) = E_2*E_4/(E_6*j).
 * @author Sean A. Irvine
 */
public class A145200 extends A282019 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  private final Polynomial<Z> mA = Polynomial.create(0); // effectively x * A282019
  private final Polynomial<Z> mE6 = RING.create(Collections.emptyList());
  private final Polynomial<Z> mA521 = RING.create(Collections.emptyList());
  private final Sequence mE6Seq = new A013973();
  private final Sequence mA521Seq = new A000521();
  private int mN = -2;

  @Override
  public Z next() {
    if (++mN == -1) {
      return Z.ZERO;
    }
    mA.add(super.next());
    mE6.add(mE6Seq.next());
    mA521.add(mA521Seq.next());
    return RING.coeff(mA, RING.multiply(mE6, mA521, mN), mN);
  }
}

