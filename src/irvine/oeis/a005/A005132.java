package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A005132 Recam\u00e1n's sequence (or Recaman's sequence): a(0) = 0; for n &gt; 0, a(n) = a(n-1) - n if nonnegative and not already in the sequence, otherwise a(n) = a(n-1) + n.
 * @author Sean A. Irvine
 */
public class A005132 extends AbstractSequence {

  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private long mPrev;
  private long mN;

  /**
   * Construct a Recaman sequence.
   * @param offset sequence offset
   * @param initial initial term
   * @param start start increment
   */
  public A005132(final int offset, final long initial, final long start) {
    super(offset);
    mPrev = initial;
    mN = start;
  }

  /** Construct the sequence. */
  public A005132() {
    this(0, 0, -1);
  }

  @Override
  public Z next() {
    final long t = mPrev - ++mN;
    final long u = t > 0 && !mSeen.isSet(t) ? t : mPrev + mN;
    mSeen.set(u);
    mPrev = u;
    return Z.valueOf(u);
  }
}

