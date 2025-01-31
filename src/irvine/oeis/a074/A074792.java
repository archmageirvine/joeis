package irvine.oeis.a074;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074792 Least k &gt; 1 such that k^n == 1 (mod n).
 * @author Sean A. Irvine
 */
public class A074792 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.TWO;
    }
    long k = 1;
    while (true) {
      if (LongUtils.modPow(++k, mN, mN) == 1) {
        return Z.valueOf(k);
      }
    }
  }
}
