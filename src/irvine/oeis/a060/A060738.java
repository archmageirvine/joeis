package irvine.oeis.a060;

import java.util.HashSet;

import irvine.factor.factor.Factorizer;
import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A060738 Number of distinct differences between consecutive divisors (ordered by increasing magnitude) of n! which are not also divisors of n!.
 * @author Sean A. Irvine
 */
public class A060738 extends A000142 {

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
    for (final Z d : divs) {
      diffs.remove(d);
    }
    return Z.valueOf(diffs.size());
  }
}
