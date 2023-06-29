package irvine.oeis.a130;
// manually 2023-06-26

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.MemorySequence;
import irvine.oeis.a000.A000837;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A130162 Triangle read by rows: A051731 * A000837 as a diagonalized matrix.
 * @author Georg Fischer
 */
public class A130162 extends BaseTriangle {

  private MemorySequence mSeq;
  private int mOffset2; // offset of underlying sequence

  /** Construct the sequence. */
  public A130162() {
    this(1, new A000837().skip());
  }

  /**
   * Generic constructor with parameters.
   * @param offset first index of target sequence
   * @param seq underlying sequence for right border (diagonal)
   */
  public A130162(final int offset, final AbstractSequence seq) {
    super(offset, seq.getOffset(), seq.getOffset());
    hasRAM(true);
    mOffset2 = seq.getOffset();
    mSeq = MemorySequence.cache(mOffset2, seq, new long[0]);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    // column k has mSeq(k) interleaved with k zeros
    return ((n + 1 - mOffset2) % (k + 1 - mOffset2) == 0) ? mSeq.a(k) : Z.ZERO;
  }
}

