package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A046017 Least k &gt; 1 with k = sum of digits of k^n, or 0 if no such k exists.
 * @author Sean A. Irvine
 */
public class A046017 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 1;
    while (true) {
      final Z zk = Z.valueOf(++k);
      if (ZUtils.digitSum(zk.pow(mN)) == k) {
        return zk;
      }
    }
  }
}
