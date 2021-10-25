package irvine.oeis.a204;
// manually triuple at 2021-10-24 20:58

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A204026 Symmetric matrix based on f(i,j)=min(F(i+1),F(j+1)), where F=A000045 (Fibonacci numbers), by antidiagonals.
 *
 * @author Georg Fischer
 */
public class A204026 extends UpperLeftTriangle {

  protected MemorySequence mSeq;

  /**
   * Construct the sequence.
   */
  public A204026() {
    super(1, 1, -1);
    mSeq = MemorySequence.cachedSequence(new A000045());
  }

  @Override
  public Z matrixElement(final int i, final int j) {
    return mSeq.a(i + 1).min(mSeq.a(j + 1));
  }
}
