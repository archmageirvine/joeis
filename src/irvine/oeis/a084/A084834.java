package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A084834 a(n) is the smallest number not previously used such that a(n)+a(n-1), a(n)+a(n-1)+a(n-2), ..., a(n)+...+a(1) are not prime.
 * @author Sean A. Irvine
 */
public class A084834 extends CachedSequence {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();

  /** Construct the sequence. */
  public A084834() {
    super(1);
  }

  @Override
  protected Z compute(final Z nn) {
    final long n = nn.longValueExact();
    if (n == 1) {
      return Z.ONE;
    }
    long m = 1;
    while (true) {
      if (!mUsed.isSet(++m)) {
        Z sum = Z.valueOf(m);
        boolean ok = true;
        for (long k = n - 1; k > 0; --k) {
          sum = sum.add(a(k));
          if (sum.isProbablePrime()) {
            ok = false;
            break;
          }
        }
        if (ok) {
          mUsed.set(m);
          return Z.valueOf(m);
        }
      }
    }
  }
}

