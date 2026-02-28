package irvine.oeis.a393;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393492 S-practical numbers: numbers m such that every number 1 &lt;= k &lt;= Sum_{d|m} s(d) = A211779(m) is a subsum of the multiset {s(d) : d|m}, where s is the sum of aliquot divisors function (A001065).
 * @author Sean A. Irvine
 */
public class A393492 extends Sequence1 {

  private long mN = 0;

  static boolean is(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    final List<Z> v = new ArrayList<>();
    for (final Z d : fs.divisors()) {
      v.add(Functions.SIGMA1.z(d).subtract(d));
    }
    Collections.sort(v);
    Z s = Z.ONE;
    for (int k = 0; k < v.size() - 1; ++k) {
      s = s.add(v.get(k));
      if (v.get(k + 1).compareTo(s) > 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
