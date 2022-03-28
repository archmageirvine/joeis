package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a047.A047713;

/**
 * A055551 Number of base-2 Euler-Jacobi pseudoprimes (A047713) less than 10^n.
 * @author Sean A. Irvine
 */
public class A055551 extends A047713 {

  private long mA = super.next().longValueExact();
  private long mLimit = 1;
  private long mCount = 0;

  @Override
  public Z next() {
    mLimit *= 10;
    while (mA < mLimit) {
      ++mCount;
      mA = super.next().longValueExact();
    }
    return Z.valueOf(mCount);
  }
}
