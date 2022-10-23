package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058007 Freestyle perfect numbers n = Product_{i=1,..,k} f_i^e_i where 1 &lt; f_1 &lt;  ... &lt; f_k, e_i &gt; 0, such that 2n = Product_{i=1,..,k} (f_i^(e_i+1)-1)/(f_i-1).
 * @author Sean A. Irvine
 */
public class A058007 extends Sequence1 {

  private long mN = 5;

  private boolean is(final long n, final long f, final long s) {
    if (n == 1) {
      return 2 * mN == s;
    }
    for (long k = f + 1; k <= n; ++k) {
      long j = k;
      while (n % j == 0) {
        if (is(n / j, k, s * (j * k - 1) / (k - 1))) {
          return true;
        }
        j *= k;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN, 1, 1)) {
        return Z.valueOf(mN);
      }
    }
  }
}
