package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A072998 To get a(n), write n in balanced ternary notation (using only digits -1, 0, 1, -1), then change -1's to 0's, 0's to 1's, and 1's to 2's.
 * @author Sean A. Irvine
 */
public class A072998 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long n = ++mN;
    Z t = Z.ONE;
    Z s = Z.ZERO;
    do {
      final long r = n % 3;
      n /= 3;
      if (r == 2) {
        ++n;
      } else {
        s = s.add(t.multiply(r + 1));
      }
      t = t.multiply(10);
    } while (n > 0);
    return s;
  }
}
