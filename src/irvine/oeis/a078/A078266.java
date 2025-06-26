package irvine.oeis.a078;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A078266 Integer part of the arithmetic mean of all the distinct numbers formed by permuting the digits of concatenation of numbers from 1 to n.
 * @author Sean A. Irvine
 */
public class A078266 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder();
    for (int k = 1; k <= mN; ++k) {
      sb.append(k);
    }
    final int[] cnts = ZUtils.digitCounts(new Z(sb));
    return Z.TEN.pow(sb.length()).subtract(1)
      .multiply(Integers.SINGLETON.sum(1, 9, k -> Z.valueOf(cnts[k]).multiply(k)))
      .divide(9L * sb.length());
  }
}

