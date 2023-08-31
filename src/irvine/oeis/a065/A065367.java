package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065367 Replace 3^k with (-3)^k in balanced ternary expansion of n.
 * @author Sean A. Irvine
 */
public class A065367 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long n = ++mN;
    long s = 0;
    long m = 1;
    while (n > 0) {
      final long r = n % 3;
      n /= 3;
      if (r == 2) {
        s -= m;
        ++n;
      } else {
        s += r * m;
      }
      m *= -3;
    }
    return Z.valueOf(s);
  }
}
