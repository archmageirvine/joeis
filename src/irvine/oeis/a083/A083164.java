package irvine.oeis.a083;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A083164 Rearrangement of natural numbers such that n divides sum of the terms with index which are the divisors of n.
 * @author Sean A. Irvine
 */
public class A083164 extends CachedSequence {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();

  /** Construct the sequence. */
  public A083164() {
    super(1);
  }

  @Override
  protected Z compute(final Z m) {
    final long n = m.longValueExact();
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(n).divisors()) {
      if (!d.equals(n)) {
        sum = sum.add(a(d));
      }
    }
    long r = n - sum.mod(n);
    while (mUsed.isSet(r)) {
      r += n;
    }
    mUsed.set(r);
    return Z.valueOf(r);
  }
}

