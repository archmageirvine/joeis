package irvine.oeis.a204;
// manually triuple at 2021-10-24 21:04

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A204129 Symmetric matrix based on f(i,j)=(L(i) if i=j and 1 otherwise), where L=A000032 (Lucas numbers), by antidiagonals.
 *
 * @author Georg Fischer
 */
public class A204129 extends UpperLeftTriangle {

  protected MemorySequence mSeq;

  /** Construct the sequence. */
  public A204129() {
    super(1, 1, -1);
    mSeq = MemorySequence.cachedSequence(new A000032());
  }

  @Override
  public Z matrixElement(final int i, final int j) {
    return i != j ? Z.ONE : mSeq.a(i);
  }
}
