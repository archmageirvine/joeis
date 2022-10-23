package irvine.oeis.a055;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A055427 Number of points in Z^n of norm &lt;= 3.
 * @author Sean A. Irvine
 */
public class A055427 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> C1 = Polynomial.create(1, -1);
  private final int mTerm;
  private int mN = -1;

  protected A055427(final int term) {
    mTerm = term;
  }

  /** Construct the sequence. */
  public A055427() {
    this(9);
  }

  @Override
  public Z next() {
    ++mN;
    return RING.coeff(RING.pow(ThetaFunctions.theta3z(mTerm), mN, mTerm), C1, mTerm);
  }
}
