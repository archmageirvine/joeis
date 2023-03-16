package irvine.oeis.a049;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A049116 Repeatedly apply Euler phi to n; a(n) = highest power of 2 that is seen.
 * @author Sean A. Irvine
 */
public class A049116 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long n = ++mN;
    long max = (n & (n - 1)) == 0 ? n : 0;
    while (n != 1) {
      n = Euler.phiAsLong(n);
      if ((n & (n - 1)) == 0) {
        max = Long.max(max, n);
      }
    }
    return Z.valueOf(max);
  }
}

