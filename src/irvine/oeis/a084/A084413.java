package irvine.oeis.a084;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A084413 Smallest prime with "n" as central digit(s), or -1 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A084413 extends Sequence0 implements DirectSequence {

  private static final long[] RIGHT = {1, 3, 7, 9};
  private long mN = -1;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    if (Predicates.PRIME.is(n)) {
      return n;
    }
    final String s = n.toString();
    // 1-digit each side
    for (long left = 1; left < 10; ++left) {
      for (final long right : RIGHT) {
        final Z t = new Z(left + s + right);
        if (t.isProbablePrime()) {
          return t;
        }
      }
    }
    // 2 digits each side
    for (long left = 10; left < 100; ++left) {
      for (long r1 = 0; r1 < 10; ++r1) {
        for (final long right : RIGHT) {
          final Z t = new Z(left + s + r1 + right);
          if (t.isProbablePrime()) {
            return t;
          }
        }
      }
    }
    throw new UnsupportedOperationException("too hard");
  }

  @Override
  public Z a(final long n) {
    return a(Z.valueOf(n));
  }
}
