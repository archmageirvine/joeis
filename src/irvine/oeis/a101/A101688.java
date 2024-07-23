package irvine.oeis.a101;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000007;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A101688 Once 1, once 0, repeat, twice 1, twice 0, repeat, thrice 1, thrice 0, ... and so on.
 * @author Georg Fischer
 */
public class A101688 extends BaseTriangle {

  private final MemorySequence mSeq;

  /** Construct the sequence. */
  public A101688() {
    this(0, new A000007());
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param seq underlying sequence
   */
  public A101688(final int offset, final Sequence seq) {
    super(offset, 0, 0); // always 0-based
    hasRAM(true);
    mSeq = MemorySequence.cachedSequence(seq);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return (k == 0) ? mSeq.a(n) : mSeq.a((n - k) / (k + 1));
  }
}
