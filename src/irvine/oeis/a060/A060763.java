package irvine.oeis.a060;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060763 Number of distinct differences between consecutive divisors (ordered by increasing magnitude) of n which are not also divisors of n.
 * @author Sean A. Irvine
 */
public class A060763 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z prev = Z.ZERO;
    final HashSet<Z> diffs = new HashSet<>();
    final Z[] divs = Jaguar.factor(++mN).divisorsSorted();
    for (final Z d : divs) {
      if (!prev.isZero()) {
        diffs.add(d.subtract(prev));
      }
      prev = d;
    }
    for (final Z d : divs) {
      diffs.remove(d);
    }
    return Z.valueOf(diffs.size());
  }
}
