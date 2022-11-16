package irvine.oeis.a007;

import java.util.ArrayList;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A007552 Exponentiation of Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A007552 extends A000045 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final ArrayList<Q> mCoeffs = new ArrayList<>();
  private int mN = 0;
  private Z mF = Z.ONE;
  {
    setOffset(1);
    mCoeffs.add(Q.ZERO);
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    mCoeffs.add(new Q(super.next(), mF));
    return RING.exp(RING.create(mCoeffs), mN).coeff(mN).multiply(mF).toZ();
  }
}
