package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A083778 Triangle of primes derived in A083776.
 * @author Sean A. Irvine
 */
public class A083778 extends A083776 {

  private int mM = 0;
  private Z[] mRow = {};
  private Z mProd = null;

  @Override
  public Z next() {
    if (++mM >= mRow.length) {
      mRow = new Z[mRow.length + 1];
      for (int k = 0; k < mRow.length; ++k) {
        mRow[k] = super.next();
      }
      mProd = Functions.PRODUCT.z(mRow);
      mM = 0;
    }
    return mProd.divide(mRow[mM]).add(2);
  }
}
