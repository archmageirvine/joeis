package irvine.oeis.a060;

import java.util.HashSet;

import irvine.factor.factor.Factorizer;
import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A060737 Number of distinct differences between consecutive divisors of n! (ordered by size).
 * @author Sean A. Irvine
 */
public class A060737 extends A000142 {

  private final Factorizer mFactor = new PrimeDivision();

  @Override
  public Z next() {
    Z prev = Z.ZERO;
    final HashSet<Z> diffs = new HashSet<>();
    for (final Z d : mFactor.factorize(super.next()).divisorsSorted()) {
      if (!prev.isZero()) {
        diffs.add(d.subtract(prev));
      }
      prev = d;
    }
    return Z.valueOf(diffs.size());
  }
}
