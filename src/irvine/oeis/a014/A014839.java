package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.oeis.a246.A246655;

/**
 * A014839 Sum of all the digits of n in every prime-power base from 2 to n-1.
 * @author Sean A. Irvine
 */
public class A014839 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    long sum = 0;
    final A246655 pp = new A246655();
    for (long base = pp.nextLong(); base < mN; base = pp.nextLong()) {
      sum += ZUtils.digitSum(mN, base);
    }
    return Z.valueOf(sum);
  }
}
