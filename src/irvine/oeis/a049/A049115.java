package irvine.oeis.a049;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049115 If n is a power of 2, then a(n) = 0; otherwise, a(n) is the number of iterations of the Euler phi function that must be repeatedly applied to n to reach 1.
 * @author Sean A. Irvine
 */
public class A049115 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    long n = ++mN;
    if ((n & (n - 1)) == 0) {
      return Z.ZERO;
    }
    long cnt = 1;
    while (n != 1) {
      n = LongUtils.phi(n);
      if ((n & (n - 1)) != 0) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

