package irvine.oeis.a293;

import java.util.ArrayList;
import java.util.List;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A293188 Unitary pseudoperfect numbers: numbers that equal to the sum of a subset of their aliquot unitary divisors.
 * @author Sean A. Irvine
 */
public class A293188 extends Sequence1 {

  private long mN = 5;

  private boolean isPseudoperfect(final List<Z> d, final int pos, final Z sum) {
    final int c = sum.compareTo(d.get(d.size() - 1));
    if (c >= 0) {
      return c == 0;
    }
    for (int k = pos - 1; k >= 0; --k) {
      if (isPseudoperfect(d, k, sum.add(d.get(k)))) {
        return true;
      }
    }
    return false;
  }

  private List<Z> unitaryDivisors(final long n) {
    final ArrayList<Z> res = new ArrayList<>();
    for (final Z dd : Jaguar.factor(n).divisorsSorted()) {
      final long d = dd.longValue();
      if (LongUtils.gcd(d, n / d) == 1) {
        res.add(dd);
      }
    }
    return res;
  }

  @Override
  public Z next() {
    while (true) {
      final List<Z> d = unitaryDivisors(++mN);
      if (isPseudoperfect(d, d.size() - 1, Z.ZERO)) {
        return Z.valueOf(mN);
      }
    }
  }
}
