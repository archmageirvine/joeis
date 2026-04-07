package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A394252 a(1)=1; for n&gt;1, a(n) is the smallest integer greater than a(n-1) that cannot be written as the sum of exactly n-1 elements from {a(1),...,a(n-1)}, repetition allowed.
 * @author Sean A. Irvine
 */
public class A394252 extends CachedSequence {

  /** Construct the sequence. */
  public A394252() {
    super(1);
  }

  private boolean isRepresentable(final Z n, final long pos, final long remaining) {
    if (remaining == 0) {
      return n.isZero();
    }
    if (n.subtract(a(pos).multiply(remaining)).signum() > 0) {
      return false;
    }
    for (long k = pos; k >= 1; --k) {
      final Z t = n.subtract(a(k));
      if (t.signum() >= 0 && isRepresentable(t, k, remaining - 1)) {
        return true;
      }
    }
    return false;
  }

  @Override
  protected Z compute(final Z m) {
    final long n = m.longValueExact();
    if (n == 1) {
      return Z.ONE;
    }
    Z k = a(n - 1).add(1);
    while (isRepresentable(k, n - 1, n - 1)) {
      k = k.add(1);
    }
    return k;
  }
}
