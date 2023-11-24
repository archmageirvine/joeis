package irvine.oeis.a066;

import java.util.ArrayList;
import java.util.List;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066874 Number of partitions of n into unitary divisors of n.
 * @author Sean A. Irvine
 */
public class A066874 extends Sequence1 {

  private long mN = 0;

  private List<Long> unitaryDivisors(final long n) {
    final ArrayList<Long> res = new ArrayList<>();
    for (final Z dd : Jaguar.factor(n).divisorsSorted()) {
      final long d = dd.longValue();
      if (LongUtils.gcd(d, n / d) == 1) {
        res.add(d);
      }
    }
    return res;
  }

  private Z partitions(final long n, final List<Long> parts, final int pos) {
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = pos; k < parts.size() && parts.get(k) <= n; ++k) {
      sum = sum.add(partitions(n - parts.get(k), parts, k));
    }
    return sum;
  }

  @Override
  public Z next() {
    return partitions(++mN, unitaryDivisors(mN), 0);
  }
}

