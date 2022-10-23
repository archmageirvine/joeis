package irvine.oeis.a055;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A055408 Number of points in N^9 of norm &lt;= n.
 * @author Sean A. Irvine
 */
public class A055408 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> C1 = Polynomial.create(512, -512);
  private int mM = -3;
  private int mN = 1;

  @Override
  public Z next() {
    mM += 2;
    mN += mM;
    return RING.coeff(RING.pow(RING.add(RING.one(), ThetaFunctions.theta3z(mN)), 9, mN), C1, mN);
  }
}
