package irvine.oeis.a215;

import irvine.math.z.Z;
import irvine.oeis.a214.A214823;

/**
 * A215018 Number of unsensed hypermaps with n darts and <code>any</code> genus.
 * @author T. R. S. Walsh
 * @author Sean A. Irvine
 */
public class A215018 extends A214823 {

  private int mN = 0;

  @Override
  public Z next() {
    hypermapCount(2, ++mN, 1, mN + 1, false);
    return Z.valueOf(mSumSumU);
  }
}
