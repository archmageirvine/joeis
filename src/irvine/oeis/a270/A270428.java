package irvine.oeis.a270;
// manually 2026-07-14.ack/filnum at 2026-07-14 14:33

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.DirectPredicate;
import irvine.oeis.FilterNumberSequence;

/**
 * A270428 Exponentially odious numbers: 1 together with positive integers n such that all exponents in prime factorization of n are odious numbers (A000069).
 * @author Georg Fischer
 */
public class A270428 extends FilterNumberSequence implements DirectPredicate {

  /** Construct the sequence. */
  public A270428() {
    super(1, 1, k -> k == 1 || FactorUtils.iterate(k, 0L, (x, p, e) -> x + ((Integer.bitCount(e) & 1) == 1 ? 0 : 1)) == 0L);
  }

  @Override
  public boolean is(final Z k) {
    return k.isOne() || FactorUtils.iterate(k, 0L, (x, p, e) -> x + ((Integer.bitCount(e) & 1) == 1 ? 0 : 1)) == 0L;
  }

  @Override
  public boolean is(final long k) {
    return k == 1 || FactorUtils.iterate(k, 0L, (x, p, e) -> x + ((Integer.bitCount(e) & 1) == 1 ? 0 : 1)) == 0L;
  }
}
