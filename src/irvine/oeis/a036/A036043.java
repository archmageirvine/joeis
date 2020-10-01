package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a008.A008284;

/**
 * A036043 Irregular triangle read by rows: row n (n &gt;= 0) gives number of parts in all partitions of n (in Abramowitz and Stegun order).
 * @author Sean A. Irvine
 */
public class A036043 implements Sequence {

  private final A008284 mByParts = new A008284();
  private long mN = -1;
  private long mM = 1;
  private long mC = 0;

  @Override
  public Z next() {
    if (mC > 0) {
      --mC;
      return Z.valueOf(mM);
    }
    if (++mM > mN) {
      if (++mN == 0) {
        return Z.ZERO;
      }
      mM = 1;
    }
    mC = mByParts.get(mN, mM).longValueExact() - 1;
    return Z.valueOf(mM);
  }
}

