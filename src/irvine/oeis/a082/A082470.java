package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A082470 a(n) is the number of k &gt;= 0 such that k! + prime(n) is prime.
 * @author Sean A. Irvine
 */
public class A082470 extends A000040 {

  @Override
  public Z next() {
    final long p = super.next().longValueExact();
    long cnt = 0;
    Z f = Z.ONE;
    for (long k = 0; k < p; ++k) {
      if (k > 1) {
        f = f.multiply(k);
      }
      if (f.add(p).isProbablePrime()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

