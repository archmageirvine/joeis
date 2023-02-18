package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061486 Let the number of digits in n be k; a(n) = sum of the products of the digits of n taken r at a time where r ranges from 1 to k.
 * @author Sean A. Irvine
 */
public class A061486 extends Sequence0 {

  private long mN = -1;

  static int[] digits(final long n) {
    final String s = String.valueOf(n);
    final int[] r = new int[s.length()];
    for (int k = 0; k < s.length(); ++k) {
      r[k] = s.charAt(k) - '0';
    }
    return r;
  }

  @Override
  public Z next() {
    final int[] d = digits(++mN);
    Z sum = Z.ZERO;
    final long lim = 1L << d.length;
    for (long s = 1; s < lim; ++s) {
      long t = s;
      Z prod = Z.ONE;
      int k = 0;
      while (t != 0) {
        if ((t & 1) == 1) {
          prod = prod.multiply(d[k]);
        }
        ++k;
        t >>>= 1;
      }
      sum = sum.add(prod);
    }
    return sum;
  }
}

