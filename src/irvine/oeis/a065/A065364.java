package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065364 Alternating sum of balanced ternary digits in n. Replace 3^k with (-1)^k in balanced ternary expansion of n.
 * @author Sean A. Irvine
 */
public class A065364 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long n = ++mN;
    long s = 0;
    long sign = 1;
    while (n > 0) {
      final long r = n % 3;
      n /= 3;
      if (r == 2) {
        s -= sign;
        ++n;
      } else {
        s += r * sign;
      }
      sign = -sign;
    }
    return Z.valueOf(s);
  }
}
