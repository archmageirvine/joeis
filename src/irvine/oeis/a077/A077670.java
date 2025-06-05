package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A077668 Last term of row n of A077667.
 * @author Sean A. Irvine
 */
public class A077670 extends A002808 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final long c = super.next().longValueExact();
    long k = 3;
    for (long m = 0; m < mN; ++m) {
      while (true) {
        if (++k % c != 0 && c % k != 0 && Functions.GCD.l(k, c) != 1) {
          break;
        }
      }
    }
    return Z.valueOf(k);
  }
}
