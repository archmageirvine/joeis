package irvine.oeis.a133;
// manually at 2023-06-22

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a007.A007438;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A133727 A051731 * A007438 as a diagonalized matrix.
 * @author Georg Fischer
 */
public class A133727 extends BaseTriangle {

  private final MemorySequence mSeq = MemorySequence.cachedSequence(new PrependSequence(new A007438(), 0));

  /** Construct the sequence. */
  public A133727() {
    super(1, 1, 1);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    // column k has mSeq(k) interleaved with k zeros
    return (n % k == 0) ? mSeq.a(k) : Z.ZERO;
  }
}

