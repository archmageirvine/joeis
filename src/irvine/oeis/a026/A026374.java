package irvine.oeis.a026;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026374 Triangular array T read by rows: <code>T(n,0) = T(n,n) = 1</code> for all <code>n &gt;= 0, T(n,k) = T(n-1,k-1) + T(n-1,k)</code> for odd n and <code>1&lt; = k &lt;= n-1, T(n,k) = T(n-1,k-1) + T(n-1,k) + T(n-2,k-1)</code> for even n and <code>1 &lt;= k &lt;= n-1</code>.
 * @author Sean A. Irvine
 */
public class A026374 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> EVEN = Polynomial.create(1, 3, 1);
  protected Polynomial<Z> mGfRow = RING.zero();
  protected int mN = -1;
  private int mM = 0;

  protected void nextRow() {
    if ((++mN & 1) == 0) {
      mGfRow = RING.pow(EVEN, mN / 2);
    } else {
      mGfRow = RING.multiply(mGfRow, RING.onePlusXToTheN(1));
    }
  }

  @Override
  public Z next() {
    if (++mM > mGfRow.degree()) {
      mM = 0;
      nextRow();
    }
    return mGfRow.coeff(mM);
  }

}
