package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046017 Least k &gt; 1 with k = sum of digits of k^n, or 0 if no such k exists.
 * @author Sean A. Irvine
 */
public class A046017 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 1;
    while (true) {
      final Z zk = Z.valueOf(++k);
      if (Functions.DIGIT_SUM.l(zk.pow(mN)) == k) {
        return zk;
      }
    }
  }
}
