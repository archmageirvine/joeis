package irvine.oeis.a204;
// manually triuple at 2021-10-24 21:04

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A204120 Symmetric matrix based on f(i,j) = gcd(prime(i+1),prime(j+1)), by antidiagonals.
 *
 * @author Georg Fischer
 */
public class A204120 extends UpperLeftTriangle {

  protected MemorySequence mSeq;

  /** Construct the sequence. */
  public A204120() {
    super(1, 1, -1);
    mSeq = MemorySequence.cachedSequence(new A000040());
  }

  @Override
  public Z matrixElement(final int i, final int j) {
    return mSeq.a(i).gcd(mSeq.a(j));
  }
}
