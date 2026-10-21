package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A086937 Number of distinct zeros of x^2-x-1 mod prime(n).
 * @author Sean A. Irvine
 */
public class A086937 extends A000040 {

  @Override
  public Z next() {
    final long p = super.next().longValueExact();
    long cnt = 0;
    for (long k = 0; k < p; ++k) {
      if ((k * k - k - 1) % p == 0) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}


