package irvine.oeis.a130;
// manually triprom/triprov at 2023-05-31 18:05

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a000.A000837;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A130162 Triangle read by rows: A051731 * A000837 as a diagonalized matrix.
 * @author Georg Fischer
 */
public class A130162 extends BaseTriangle {

  private final MemorySequence mSeq = MemorySequence.cachedSequence(new A000837());

  /** Construct the sequence. */
  public A130162() {
    super(0, 1, 1);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    // column k has mSeq(k) interleaved with k zeros
    return (n % k == 0) ? mSeq.a(k) : Z.ZERO;
  }
}

