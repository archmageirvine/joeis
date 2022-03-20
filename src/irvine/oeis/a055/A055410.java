package irvine.oeis.a055;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055410 Number of points in Z^4 of norm &lt;= n.
 * @author Sean A. Irvine
 */
public class A055410 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> C1 = Polynomial.create(1, -1);
  private final int mExponent;
  private int mM = -3;
  private int mN = 1;

  protected A055410(final int exponent) {
    mExponent = exponent;
  }

  /** Construct the sequence. */
  public A055410() {
    this(4);
  }

  @Override
  public Z next() {
    mM += 2;
    mN += mM;
    return RING.coeff(RING.pow(ThetaFunctions.theta3z(mN), mExponent, mN), C1, mN);
  }
}
