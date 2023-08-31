package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A065363 Sum of balanced ternary digits in n. Replace 3^k with 1 in balanced ternary expansion of n.
 * @author Sean A. Irvine
 */
public class A065363 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long n = ++mN;
    long s = 0;
    while (n > 0) {
      final long r = n % 3;
      n /= 3;
      if (r == 2) {
        --s;
        ++n;
      } else {
        s += r;
      }
    }
    return Z.valueOf(s);
  }
}
