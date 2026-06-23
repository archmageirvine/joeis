package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395625 a(n) = round(1/(b(n) - round(b(n)))), where b(n) = sqrt(k) + sqrt(m) + sqrt(p) with k = A395622(n) and positive nonsquare p &lt; m &lt; k minimizing the distance of b(n) from the nearest integer.
 * @author Sean A. Irvine
 */
public class A395625 extends Sequence1 {

  private final A395622 mA395622 = new A395622();

  @Override
  public Z next() {
    final long k = mA395622.next().longValue();
    final CR r = CR.valueOf(k).sqrt();

    CR bestD = null;
    CR bestT = CR.ZERO;
    for (long m = 2; m < k; ++m) {
      if (Predicates.SQUARE.is(m)) {
        continue;
      }
      final CR s = CR.valueOf(m).sqrt().add(r);
      for (long p = 2; p < m; ++p) {
        if (Predicates.SQUARE.is(p)) {
          continue;
        }
        final CR t = CR.valueOf(p).sqrt().add(s);
        final Z nearest = t.round();
        final CR dist = t.subtract(nearest).abs();
        if (bestD == null || dist.compareTo(bestD) < 0) {
          bestD = dist;
          bestT = t;
        }
      }
    }
    return bestT.subtract(bestT.round()).inverse().round();
  }
}
