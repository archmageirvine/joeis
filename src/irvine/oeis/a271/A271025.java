package irvine.oeis.a271;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a000.A000108;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A271025 A(n, k) is the n-th binomial transform of the Catalan sequence (A000108) evaluated at k. Array read by descending antidiagonals for n &gt;= 0 and k &gt;= 0.
 * A(0,j) = A000108(j); A(i,j) = Sum_{k=0..j} binomial(j,k)*A000108(k)*i^(j-k).
 * @author Georg Fischer
 */
public class A271025 extends UpperLeftTriangle {

  private final MemorySequence mSeq = MemorySequence.cachedSequence(new A000108());

  /** Construct the sequence. */
  public A271025() {
    super(0, 0, -1);
  }

  @Override
  public Z matrixElement(final int i, final int j) {
    if (i == 0) {
      return mSeq.a(j);
    }
    Z sum = Z.ZERO;
    for (int k = 0; k <= j; ++k) {
      sum = sum.add(Binomial.binomial(j, k).multiply(mSeq.a(k)).multiply(Z.valueOf(i).pow(j - k)));
    }
    return sum;
  }
}
