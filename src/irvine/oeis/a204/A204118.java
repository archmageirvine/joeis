package irvine.oeis.a204;
// manually triuple at 2021-10-24 21:04

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A204118 Symmetric matrix based on f(i,j) = gcd(prime(i), prime(j)), by antidiagonals.
 *
 * @author Georg Fischer
 */
public class A204118 extends UpperLeftTriangle {

  protected MemorySequence mSeq;

  /**
   * Construct the sequence.
   */
  public A204118() {
    super(1, 1, -1);
    mSeq = MemorySequence.cachedSequence(new A000040());
  }

  @Override
  public Z matrixElement(final int i, final int j) {
    return mSeq.a(i - 1).gcd(mSeq.a(j - 1));
  }
}
