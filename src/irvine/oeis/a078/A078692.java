package irvine.oeis.a078;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078692 Triangle reads by rows: T(n,k) = coefficient of x^k in (x^3-2*x^2-2*x+1)^n.
 * @author Sean A. Irvine
 */
public class A078692 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> DEN = Polynomial.create(1, -2, -2, 1);
  private Polynomial<Z> mQ = DEN;
  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM > mQ.degree()) {
      ++mN;
      mQ = RING.pow(DEN, mN + 1);
      mM = 0;
    }
    return mQ.coeff(mM);
  }
}

