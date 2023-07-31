package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064834 If n (in base 10) is d_1 d_2 ... d_k then a(n) = Sum_{i = 1..[k/2] } |d_i - d_{k-i+1}|.
 * @author Sean A. Irvine
 */
public class A064834 extends Sequence0 {

  private long mN = -1;

  static long count(final long n) {
    final String s = String.valueOf(n);
    long sum = 0;
    for (int k = 0; k < s.length() / 2; ++k) {
      sum += Math.abs(s.charAt(k) - s.charAt(s.length() - 1 - k));
    }
    return sum;
  }

  @Override
  public Z next() {
    return Z.valueOf(count(++mN));
  }
}
