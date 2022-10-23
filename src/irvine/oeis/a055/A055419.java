package irvine.oeis.a055;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A055419 Number of points in N^n of norm &lt;= 4.
 * @author Sean A. Irvine
 */
public class A055419 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final int mTerm;
  private int mN = -1;

  protected A055419(final int term) {
    mTerm = term;
  }

  /** Construct the sequence. */
  public A055419() {
    this(16);
  }

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> den = Polynomial.create(1L << mN, -(1L << mN));
    return RING.coeff(RING.pow(RING.add(RING.one(), ThetaFunctions.theta3z(mTerm)), mN, mTerm), den, mTerm);
  }
}
