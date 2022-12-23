package irvine.oeis.a060;

import java.util.HashSet;

import irvine.factor.factor.Factorizer;
import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A060742 Number of divisors of n! which are also differences between consecutive divisors of n! (ordered by size).
 * @author Sean A. Irvine
 */
public class A060742 extends A000142 {

  private final Factorizer mFactor = new PrimeDivision();

  @Override
  public Z next() {
    Z prev = Z.ZERO;
    final HashSet<Z> diffs = new HashSet<>();
    final Z[] divs = mFactor.factorize(super.next()).divisorsSorted();
    for (final Z d : divs) {
      if (!prev.isZero()) {
        diffs.add(d.subtract(prev));
      }
      prev = d;
    }
    long cnt = 0;
    for (final Z d : divs) {
      if (diffs.contains(d)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
