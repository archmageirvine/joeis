package irvine.oeis.a069;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069743.
 * @author Sean A. Irvine
 */
public class A069765 extends Sequence1 {

  private final List<Set<Q>> mA = new ArrayList<>();

  @Override
  public Z next() {
    final int n = mA.size();
    if (n == 0) {
      mA.add(Collections.singleton(Q.ONE));
    } else {
      final Set<Q> res = new HashSet<>();
      for (int j = 0; j <= n / 2; ++j) {
        for (final Q s : mA.get(j)) {
          for (final Q t : mA.get(n - 1 - j)) {
            res.add(s.add(t));
            res.add(s.multiply(t));
            if (!s.isZero()) {
              res.add(t.divide(s));
            }
            if (!t.isZero()) {
              res.add(s.divide(t));
            }
          }
        }
      }
      mA.add(res);
      /*
          out = set()
    for j in range(1, m//2+1):
        for x in f(j):
            for y in f(m-j):
                out.update([x + y, x * y])
                if y: out.add(Fraction(x, y))
                if x: out.add(Fraction(y, x))
    return out
       */
    }
    return Z.valueOf(mA.get(n).size());
  }
}
