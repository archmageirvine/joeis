package irvine.oeis.a204;
// manually triuple at 2021-10-24 21:04

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A204127 Symmetric matrix based on f(i,j)=(F(i+1) if i=j and 1 otherwise), where F=A000045 (Fibonacci numbers), by antidiagonals.
 *
 * @author Georg Fischer
 */
public class A204127 extends UpperLeftTriangle {

  protected MemorySequence mSeq;

  /** Construct the sequence. */
  public A204127() {
    super(1, 1, -1);
    mSeq = MemorySequence.cachedSequence(new A000045());
  }

  @Override
  public Z matrixElement(final int i, final int j) {
    return i != j ? Z.ONE : mSeq.a(i + 1);
  }
}
