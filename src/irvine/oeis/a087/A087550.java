package irvine.oeis.a087;

import java.util.HashSet;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A087550 a(n) = smallest k such that for each r, 2 &lt;= r &lt;= n, there exists a distinct s, n &lt; s &lt;= k, with the same prime signature as r.
 * @author Sean A. Irvine
 */
public class A087550 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    final HashSet<Long> used = new HashSet<>();
    long k = 0;
    for (long r = 2; r <= mN; ++r) {
      final Z sr = FactorUtils.leastPrimeSignature(r);
      long s = mN;
      while (true) {
        if (!used.contains(++s) && FactorUtils.leastPrimeSignature(s).equals(sr)) {
          used.add(s);
          if (s > k) {
            k = s;
          }
          break;
        }
      }
    }
    return Z.valueOf(k);
  }
}

