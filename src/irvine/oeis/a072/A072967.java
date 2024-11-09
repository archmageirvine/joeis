package irvine.oeis.a072;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072967 Least k&gt;n such that the last digit of k^k is the same as the last digit of n^n.
 * @author Sean A. Irvine
 */
public class A072967 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long t = LongUtils.modPow(++mN, mN, 10);
    long k = mN;
    while (true) {
      if (LongUtils.modPow(++k, k, 10) == t) {
        return Z.valueOf(k);
      }
    }
  }
}

