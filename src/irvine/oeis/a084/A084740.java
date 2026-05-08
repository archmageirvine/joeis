package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A084740 Least k such that (n^k-1)/(n-1) is prime, or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A084740 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    if (mN == 9 || mN == 25 || mN == 32 || mN == 49 || mN == 64 || mN == 81 || mN == 121 || mN == 125 || mN == 144 || mN == 169 || mN == 216 || mN == 225 || mN == 243 || mN == 289 || mN == 324 || mN == 343) {
      return Z.ZERO;
    }
    Z t = Z.ONE;
    long k = 0;
    while (true) {
      ++k;
      t = t.multiply(mN);
      final Z u = t.subtract(1).divide(mN - 1);
      if (u.isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
