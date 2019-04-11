package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A014837 Sum of all the digits of n in every base from 2 to <code>n-1</code>.
 * @author Sean A. Irvine
 */
public class A014837 implements Sequence {

  protected long mN = 2;

  protected long nextSum() {
    ++mN;
    long sum = 0;
    for (long base = 2; base < mN; ++base) {
      sum += ZUtils.digitSum(mN, base);
    }
    return sum;
  }

  @Override
  public Z next() {
    return Z.valueOf(nextSum());
  }
}
