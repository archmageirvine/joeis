package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a001.A001567;

/**
 * A055550 Number of Poulet numbers (or pseudoprimes to base 2, A001567) less than 10^n.
 * @author Sean A. Irvine
 */
public class A055550 extends A001567 {

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
