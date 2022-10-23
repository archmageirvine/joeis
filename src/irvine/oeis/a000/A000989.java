package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000989 3-adic valuation of binomial(2*n, n): largest k such that 3^k divides binomial(2*n, n).
 * @author Sean A. Irvine
 */
public class A000989 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long c = 0;
    long k = 3;
    while (k <= mN) {
      long w = k;
      while (w % 3 == 0) {
        --c;
        w /= 3;
      }
      k += 3;
    }
    while (k <= 2 * mN) {
      long w = k;
      while (w % 3 == 0) {
        ++c;
        w /= 3;
      }
      k += 3;
    }
    return Z.valueOf(c);
  }
}

