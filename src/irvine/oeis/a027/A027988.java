package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A027988 Greatest number in row n of array T given by A027926.
 * @author Sean A. Irvine
 */
public class A027988 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ONE;
    for (long m = 1; m < 2 * mN; ++m) {
      max = max.max(A027926.t(mN, m));
    }
    return max;
  }
}
