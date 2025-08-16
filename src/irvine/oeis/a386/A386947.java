package irvine.oeis.a386;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A386947 allocated for Jules Beauchamp.
 * @author Sean A. Irvine
 */
public class A386947 extends AbstractSequence {

  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private long mPrev;
  private long mN;

  /**
   * Construct a Recaman sequence.
   * @param offset sequence offset
   * @param initial initial term
   * @param start start increment
   */
  public A386947(final int offset, final long initial, final long start) {
    super(offset);
    mPrev = initial;
    mN = start;
  }

  /** Construct the sequence. */
  public A386947() {
    this(0, 0, -1);
  }

  @Override
  public Z next() {
    final long t = mPrev - ++mN;
    final long u = t >= 0 && !mSeen.isSet(t) ? t : mPrev + mN + 2;
    mSeen.set(u);
    mPrev = u;
    return Z.valueOf(u);
  }
}

