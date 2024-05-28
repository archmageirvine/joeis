package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069871 Numbers m that divide the concatenation of m-1 and m+1.
 * @author Sean A. Irvine
 */
public class A069871 extends Sequence1 {

  private boolean mSpecial = true;
  private int mN = 1;

  @Override
  public Z next() {
    if (mN == 2 && mSpecial) {
      mSpecial = false;
      return Z.NINE;
    }
    final int k = ++mN / 13;
    final int j = mN % 13;
    if ((j & 1) == 1) {
      return Z.TEN.pow(1 + j / 2 + 6 * k).subtract(1).divide(9);
    } else if (j == 12) {
      return Z.TEN.pow(6 * (k + 1)).subtract(1).divide(7);
    } else {
      return Z.TEN.pow(j / 2 + 6 * k).subtract(1).divide(3);
    }
  }
}

