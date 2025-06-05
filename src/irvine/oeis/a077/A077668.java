package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A077668 Last term of row n of A077667.
 * @author Sean A. Irvine
 */
public class A077668 extends A002808 {

  @Override
  public Z next() {
    final long n = super.next().longValueExact();
    long k = 3;
    for (long m = 0; m < n; ++m) {
      while (true) {
        if (++k % n != 0 && n % k != 0 && Functions.GCD.l(k, n) != 1) {
          break;
        }
      }
    }
    return Z.valueOf(k);
  }
}
