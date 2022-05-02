package irvine.oeis.a204;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.triangle.Triangle;

/**
 * A204890 Ordered differences of primes.
 * @author Georg Fischer
 */
public class A204890 extends Triangle {

  private int mDist;
  private MemorySequence mSeq;

  /** Construct the sequence. */
  public A204890() {
    this(new A000040(), 1);
  }

  /**
   * Generic constructor with parameters
   * @param seq underlying sequence
   * @param dist number of zeros to be prepended to the underlying sequence
   */
  public A204890(final Sequence seq, final int dist) {
    mSeq = MemorySequence.cachedSequence(seq);
    mDist = dist;
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return mSeq.a(n + mDist).subtract(mSeq.a(k));
  }
}
