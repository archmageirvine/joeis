package irvine.oeis.a262;
// manually 2026-07-14.ack/filnum at 2026-07-14 14:33

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.DirectPredicate;
import irvine.oeis.FilterNumberSequence;

/**
 * A262675 Exponentially evil numbers.
 * @author Georg Fischer
 */
public class A262675 extends FilterNumberSequence implements DirectPredicate {

  /** Construct the sequence. */
  public A262675() {
    super(1, 1, k -> k == 1 || FactorUtils.iterate(k, 0L, (x, p, e) -> x + ((Integer.bitCount(e) & 1) == 0 ? 0 : 1)) == 0L);
  }

  @Override
  public boolean is(final Z k) {
    return k.isOne() || FactorUtils.iterate(k, 0L, (x, p, e) -> x + ((Integer.bitCount(e) & 1) == 0 ? 0 : 1)) == 0L;
  }

  @Override
  public boolean is(final long k) {
    return k == 1 || FactorUtils.iterate(k, 0L, (x, p, e) -> x + ((Integer.bitCount(e) & 1) == 0 ? 0 : 1)) == 0L;
  }
}
