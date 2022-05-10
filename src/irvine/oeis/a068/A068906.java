package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a000.A000041;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A068906 Square array read by ascending antidiagonals of partitions of k modulo n.
 * @author Georg Fischer
 */
public class A068906 extends UpperLeftTriangle {

  private MemorySequence mSeq = MemorySequence.cachedSequence(new A000041());

  /** Construct the sequence. */
  public A068906() {
    super(1, 1, 1);
    hasRAM(true);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return mSeq.a(n).mod(Z.valueOf(k));
  }
}
