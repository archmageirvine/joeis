package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065366 Replace 3^k with (-2)^k in balanced ternary expansion of n.
 * @author Sean A. Irvine
 */
public class A065366 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long n = ++mN;
    long s = 0;
    long bit = 1;
    while (n > 0) {
      final long r = n % 3;
      n /= 3;
      if (r == 2) {
        s -= bit;
        ++n;
      } else {
        s += r * bit;
      }
      bit *= -2;
    }
    return Z.valueOf(s);
  }
}
