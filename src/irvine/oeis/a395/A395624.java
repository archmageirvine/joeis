package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;

/**
 * A395624 a(n) = round(1/(b(n) - round(b(n)))), where b(n) = sqrt(k) + sqrt(m) with k = A395621(n) and positive nonsquare m &lt; k minimizing the distance of b(n) from the nearest integer.
 * @author Sean A. Irvine
 */
public class A395624 extends A395621 {

  @Override
  public Z next() {
    final Z k = super.next();
    final CR sqrtK = CR.valueOf(k).sqrt();
    CR best = CR.TWO;
    CR bestB = null;
    for (Z m = Z.ONE; m.compareTo(k) < 0; m = m.add(1)) {
      if (!Predicates.SQUARE.is(m)) {
        final CR b = sqrtK.add(CR.valueOf(m).sqrt());
        final CR bf = b.frac();
        final CR t = bf.min(CR.ONE.subtract(bf));
        if (t.compareTo(best) < 0) {
          best = t;
          bestB = b;
        }
      }
    }
    return bestB.subtract(bestB.round()).inverse().round();
  }
}

