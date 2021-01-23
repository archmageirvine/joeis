package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027354 Triangular array T read by rows: T(n,k) = number of partitions into distinct odd parts, the least being &lt;= k.
 * @author Sean A. Irvine
 */
public class A027354 extends A027345 {

  private int mN = 0;
  private int mM = 0;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
      mSum = Z.ZERO;
    }
    mSum = mSum.add(distinctOddPartsMinimum(mN, mM));
    return mSum;
  }
}
