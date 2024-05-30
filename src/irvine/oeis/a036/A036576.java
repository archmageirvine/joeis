package irvine.oeis.a036;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036576 a(n) is the least number not of the form floor(k^2/n).
 * @author Sean A. Irvine
 */
public class A036576 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long m = (mN++ & 3) + 1;
    return mN == 1 ? Z.TWO : Z.valueOf((mN + m + 2 * Functions.SQRT.l(mN * m - 1)) / 4);
  }
}
