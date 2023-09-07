package irvine.oeis.a076;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A076699 T(n,k) = Table of coefficients of x^k in cyclotomic(n,x).
 * @author Georg Fischer
 */
public class A076699 extends BaseTriangle {


  /** Construct the sequence. */
  public A076699() {
    super(0, 0, 0);
    hasRAM(false);
  }

  @Override
  protected void addRow() {
    super.addRow();
    final Polynomial<Z> cyclo = Cyclotomic.cyclotomic(mRow);
    for (int icoeff = 0; icoeff < mLastRow.length; ++icoeff) {
      mLastRow[icoeff] = cyclo.coeff(icoeff);
    }
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return (n == 0) ? Z.ONE : mLastRow[k];
  }
}
