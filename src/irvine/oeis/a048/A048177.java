package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A048177 Primes p = d_1 d_2 ... d_k in base 10 such that for some base b, p = Sum_{i = 1..k} b^d_i.
 * @author Sean A. Irvine
 */
public class A048177 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final int[] cnts = ZUtils.digitCounts(p);
      Z b = Z.ONE;
      Z sum;
      do {
        b = b.add(1);
        sum = Z.ZERO;
        for (int k = 0; k < cnts.length; ++k) {
          if (cnts[k] > 0) {
            sum = sum.add(b.pow(k).multiply(cnts[k]));
          }
        }
        if (sum.equals(p)) {
          return p;
        }
      } while (sum.compareTo(p) < 0);
    }
  }
}

