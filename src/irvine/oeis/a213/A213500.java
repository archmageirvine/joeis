package irvine.oeis.a213;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001477;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A213500 Rectangular array T(n,k): (row n) = b**c, where b(h) = h, c(h) = h + n - 1, n &gt;= 1, h &gt;= 1, and ** = convolution.
 * @author Georg Fischer
 */
public class A213500 extends UpperLeftTriangle {

  private final MemorySequence mSeqU;
  private final MemorySequence mSeqV;

  /** Construct the sequence. */
  public A213500() {
    this(new A001477(), new A001477());
  }

  /**
   * Generic constructor with parameters
   * @param seqU first sequence - must have offset 0
   * @param seqV second sequence - must have offset 0
   */
  public A213500(final Sequence seqU, final Sequence seqV) {
    super(1, 1, -1);
    mSeqU = MemorySequence.cachedSequence(seqU);
    mSeqV = MemorySequence.cachedSequence(seqV);
  }

  // t[n_, k_] := Sum[b[k - i] c[n + i], {i, 0, k - 1}]
  @Override
  public Z matrixElement(final int n, final int k) {
    Z sum = Z.ZERO;
    for (int i = 0; i < k; ++i) {
      sum = sum.add(mSeqU.a(k - i).multiply(mSeqV.a(n + i)));
      // System.out.print(" +" + mSeqU.a(k - i) + "*" + mSeqV.a(n + i));
    }
    // System.out.println();
    return sum;
  }
}
