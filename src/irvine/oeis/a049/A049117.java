package irvine.oeis.a049;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A049117 Smallest number which when Euler phi function is repeatedly applied have not reached a power of 2 in n steps.
 * @author Sean A. Irvine
 */
public class A049117 extends Sequence0 {

  private long mN = 0;
  private long mM = 3;

  private long count(long n) {
    if ((n & (n - 1)) == 0) {
      return 0;
    }
    long cnt = 0;
    while (true) {
      n = LongUtils.phi(n);
      ++cnt;
      if ((n & (n - 1)) == 0) {
        return cnt;
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    while (count(mM) < mN) {
      ++mM;
    }
    return Z.valueOf(mM);
  }
}

