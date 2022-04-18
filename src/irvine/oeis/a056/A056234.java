package irvine.oeis.a056;

import irvine.math.z.Z;

/**
 * A056234 Form an array with 3 rows: row 1 begins with 1; all rows are increasing; each entry is sum of 2 entries above it; each number appears at most once; smallest unused number is appended to first row if possible. Sequence gives numbers not used.
 * @author Sean A. Irvine
 */
public class A056234 extends A056231 {

  private long mN = 4;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      while (mA[0] <= mN) {
        super.next();
      }
      if (!mUsed.contains(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

