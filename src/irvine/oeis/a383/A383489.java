package irvine.oeis.a383;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A383489 a(n) is the number of divisors d_i(m) for which a divisor d_j(m) exists such that d_i(m) &lt; d_j(m) &lt; sigma(d_i(m)) where m = A383488(n).
 * @author Sean A. Irvine
 */
public class A383489 extends Sequence1 {

  private long mN = 11;

  private long count(final long n) {
    long cnt = 0;
    final Z[] d = Jaguar.factor(n).divisorsSorted();
    for (int k = 0; k < d.length - 1; ++k) {
      final Z s = Functions.SIGMA1.z(d[k]);
      if (d[k + 1].compareTo(s) < 0) {
        ++cnt;
      }
    }
    return cnt;
  }

  @Override
  public Z next() {
    while (true) {
      final long cnt = count(++mN);
      if (cnt > 0) {
        return Z.valueOf(cnt);
      }
    }
  }
}

