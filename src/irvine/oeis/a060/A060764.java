package irvine.oeis.a060;

import java.util.Collections;
import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060764 Number of divisors of n which are not also differences between consecutive divisors (ordered by increasing magnitude) of n.
 * @author Sean A. Irvine
 */
public class A060764 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z prev = Z.ZERO;
    final HashSet<Z> diffs = new HashSet<>();
    final Z[] divs = Jaguar.factor(++mN).divisorsSorted();
    Collections.addAll(diffs, divs);
    for (final Z d : divs) {
      if (!prev.isZero()) {
        diffs.remove(d.subtract(prev));
      }
      prev = d;
    }
    return Z.valueOf(diffs.size());
  }
}
