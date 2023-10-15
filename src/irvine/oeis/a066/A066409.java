package irvine.oeis.a066;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import irvine.math.MemoryFunction1;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066409 Least positive integer not representable using exactly n 9's and the operations +-* /().
 * @author Sean A. Irvine
 */
public class A066409 extends Sequence1 {

  // After Michael S. Branicky

  private int mN = 0;

  private final MemoryFunction1<Set<Q>> mA = new MemoryFunction1<>() {
    @Override
    protected Set<Q> compute(final int n) {
      if (n <= 1) {
        return n < 1 ? Collections.emptySet() : Collections.singleton(Q.NINE);
      }
      final HashSet<Q> res = new HashSet<>();
      for (int k = 1; k <= n / 2; ++k) {
        for (final Q x : get(k)) {
          for (final Q y : get(n - k)) {
            res.add(x.add(y));
            res.add(x.subtract(y));
            res.add(y.subtract(x));
            res.add(x.multiply(y));
            if (!x.isZero()) {
              res.add(y.divide(x));
            }
            if (!y.isZero()) {
              res.add(x.divide(y));
            }
          }
        }
      }
      return res;
    }
  };

  @Override
  public Z next() {
    final Set<Q> res = mA.get(++mN);
    Q k = Q.ZERO;
    while (true) {
      k = k.add(1);
      if (!res.contains(k)) {
        return k.toZ();
      }
    }
  }
}

/*

(Python)
from fractions import Fraction
from functools import lru_cache
def a(n):
    @lru_cache()
    def f(m):
        if m == 1: return {9}
        out = set()
        for j in range(1, m//2+1):
            for x in f(j):
                for y in f(m-j):
                    out.update([x + y, x - y, y - x, x * y])
                    if y: out.add(Fraction(x, y))
                    if x: out.add(Fraction(y, x))
        return out
    k, s = 1, f(n)
    while k in s: k += 1
    return k
print([a(n) for n in range(1, 10)]) # Michael S. Branicky, Feb 08 2023
 */
