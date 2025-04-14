package irvine.math.predicate;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * Test if a number is happy (see A007770).
 * @author Sean A. Irvine
 */
public class Happy extends AbstractPredicate {

  private static final int CACHE_BITS = 20;
  private final long[] mCache = new long[1 << CACHE_BITS]; // Remembers the result for small values

  private long squareDigitSum(final Z n) {
    if (n.bitLength() < CACHE_BITS) {
      final long r = mCache[n.intValue()];
      if (r != 0) {
        return r;
      }
    }
    final long s = Functions.DIGIT_SUM_SQUARES.l(n);
    if (n.bitLength() < CACHE_BITS) {
      mCache[n.intValue()] = s;
    }
    return s;
  }

  @Override
  public boolean is(Z n) {
    final HashSet<Z> seen = new HashSet<>();
    while (true) {
      if (Z.ONE.equals(n)) {
        return true;
      }
      if (!seen.add(n)) {
        return false; // cycles
      }
      n = Z.valueOf(squareDigitSum(n));
    }
  }
}
