package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.array.LongDynamicArray;
import irvine.util.array.LongDynamicLongArray;

/**
 * A000119 Number of representations of n as a sum of distinct Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A000119 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000119(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000119() {
    super(0);
  }

  private long mN = -1;
  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  private final LongDynamicArray<Z> mB = new LongDynamicArray<>();

  private Z b(final long k) {
    final Z r = mB.get(k);
    if (r != null) {
      return r;
    }
    final A000045 fib = new A000045();
    fib.next();
    fib.next();
    long f;
    Z s = Z.ZERO;
    while ((f = fib.next().longValue()) <= k) {
      if (k % f == 0) {
        s = s.signedAdd(((k / f) & 1) != 0, Z.valueOf(f));
      }
    }
    mB.set(k, s);
    return s;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      mA.set(0, 1L);
      return Z.ONE;
    }
    Z s = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      s = s.add(b(k).multiply(mA.get(mN - k)));
    }
    s = s.divide(mN);
    mA.set(mN, s.longValue());
    return s;
  }
}

