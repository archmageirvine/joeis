package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027957 a(n) = greatest number in row n of array T given by A027948.
 * @author Sean A. Irvine
 */
public class A027957 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ONE;
    for (long m = 1; m < mN; ++m) {
      max = max.max(A027926.t(mN, 2 * m + 1));
    }
    return max;
  }
}
