package irvine.oeis.a260;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A260611 a(n) = superfactorial(prime(n)-1) mod prime(n).
 * @author Sean A. Irvine
 */
public class A260611 extends A000040 {

  @Override
  public Z next() {
    final long p = super.next().longValueExact();
    long r = 1;
    long v = 1;
    for (long i = 2; i < p; ++i) {
      v *= i;
      v %= p;
      r *= v;
      r %= p;
    }
    return Z.valueOf(r);
  }
}
