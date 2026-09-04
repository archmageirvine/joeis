package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A086461 Symmetric version of square array A086460, read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A086461 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    if (mM == 0 || mM == mN) {
      return Z.ONE;
    }
    return Z.valueOf(mN - mM).multiply(mM);
  }
}

