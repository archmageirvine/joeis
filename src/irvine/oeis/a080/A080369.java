package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a003.A003022;

/**
 * A003022.
 * @author Sean A. Irvine
 */
public class A080369 extends A003022 {

  private int mN = 0;

  /** Construct the sequence. */
  public A080369() {
    super(1);
  }

  @Override
  public Z next() {
    Z prod = Z.ONE;
    if (++mN > 1) {
      super.next();
      for (int k = 1; k < mPositions.length; ++k) {
        for (int j = 0; j < k; ++j) {
          prod = prod.multiply(mPositions[k] - mPositions[j]);
        }
      }
    }
    return prod;
  }
}
