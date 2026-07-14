package irvine.oeis.a268;
// manually 2026-07-14.ack/filnum at 2026-07-14 14:33

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.DirectPredicate;
import irvine.oeis.FilterNumberSequence;

/**
 * A268335 Exponentially odd numbers.
 * @author Georg Fischer
 */
public class A268335 extends FilterNumberSequence implements DirectPredicate {

  /** Construct the sequence. */
  public A268335() {
    super(1, 1, k -> k == 1 || FactorUtils.iterate(k, 0L, (x, p, e) -> x + ((e & 1) == 1 ? 0 : 1)) == 0L);
  }

  @Override
  public boolean is(final Z k) {
    return k.isOne() || FactorUtils.iterate(k, 0L, (x, p, e) -> x + ((e & 1) == 1 ? 0 : 1)) == 0L;
  }

  @Override
  public boolean is(final long k) {
    return k == 1 || FactorUtils.iterate(k, 0L, (x, p, e) -> x + ((e & 1) == 1 ? 0 : 1)) == 0L;
  }
}
