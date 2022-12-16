package irvine.oeis.a060;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A060682 Number of distinct differences between consecutive divisors of n (ordered by size).
 * @author Sean A. Irvine
 */
public class A060682 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    Z prev = Z.ZERO;
    final HashSet<Z> diffs = new HashSet<>();
    for (final Z d : Jaguar.factor(++mN).divisorsSorted()) {
      if (!prev.isZero()) {
        diffs.add(d.subtract(prev));
      }
      prev = d;
    }
    return Z.valueOf(diffs.size());
  }
}
