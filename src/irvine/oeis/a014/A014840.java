package irvine.oeis.a014;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A014840 Sum of all the digits of n in every base prime to n from 2 to <code>n-1</code>.
 * @author Sean A. Irvine
 */
public class A014840 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    long sum = 0;
    for (long base = 2; base < mN; ++base) {
      if (LongUtils.gcd(mN, base) == 1) {
        sum += ZUtils.digitSum(mN, base);
      }
    }
    return Z.valueOf(sum);
  }
}
