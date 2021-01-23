package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A014841 Sum modulo the base of all the digits of n in every base from 2 to n-1.
 * @author Sean A. Irvine
 */
public class A014841 implements Sequence {

  protected long mN = 2;

  @Override
  public Z next() {
    ++mN;
    long sum = 0;
    for (long base = 2; base < mN; ++base) {
      sum += ZUtils.digitSum(mN, base) % base;
    }
    return Z.valueOf(sum);
  }
}
