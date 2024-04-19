package irvine.oeis.a202;
// manually 2021-10-26

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000290;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A202670 Symmetric matrix based on A000290 (the squares), by antidiagonals.
 * This is the prototype for an array called "self-fusion matrix" by Kimberling.
 * @author Georg Fischer
 */
public class A202670 extends UpperLeftTriangle {

  protected final MemorySequence mSeq;
  protected final int mSkip;
  private final int mOffset;

  /** Construct the sequence. */
  public A202670() {
    this(1, new A000290(), 1);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param seq underlying Sequence
   * @param skip number of terms in <code>mSeq</code> to be skipped.
   */
  public A202670(final int offset, final Sequence seq, final int skip) {
    super(1, 1, -1);
    setOffset(offset);
    mOffset = offset;
    mSeq = MemorySequence.cachedSequence(seq);
    mSkip = skip;
  }

  /**
   * Access the underlying Sequence with shifted offset.
   * The underlying sequence is addressed as if it had offset 1,
   * while the resulting triangle starts with <code>T(0, 0)</code>.
   * @param n index
   * @return <code>mSeq(n - 1)</code> if <code>n &gt;= 1</code>, 0 otherwise.
   */
  protected Z a(final int n) {
    return n + mSkip < 0 ? Z.ZERO : mSeq.a(n + mSkip);
  }
  
  /**
   * Computes a triangle element.
   * @param i row number, 1-based
   * @param j column number, 1-based
   * @return UpperLeftTriangle element <code>T(i, j)</code>
   * The elements are inner product sums of terms in the underlying sequence 1, 4, 9, 16.
   * <pre>
   * Triangle order:
   * n/k  0         1         2         3
   *  0   1.1       
   *  1   14.01     01.14  
   *  2   149.001   014.014   001.149
   *  3   149G.0001 0149.0014 0014.0149 0001.149G
   * </pre>
   * <pre>
   * UpperLeftTriangle order:
   * n/k  0         1         2         3
   *  0   1.1       01.14     001.149   0001.149G
   *  1   14.01     014.014   0014.0149
   *  2   149.001   0149.0014   
   *  3   149G.0001   
   * </pre>
   */
  @Override
  public Z matrixElement(final int i, final int j) {
    final int n = i - mRow0;
    final int k = j - mCol0;
    final int lenp = n + k; // sum over lenp + 1 products
    Z sum = Z.ZERO;
    for (int m = 0; m <= lenp; ++m) {
      final int il = m - n; // left index
      final int ir = m - k; // right index
      if (il >= 0 && ir >= 0) {
        sum = sum.add(a(il).multiply(a(ir)));
      }
      // System.out.println("\tn=" + n + "\tk=" + k + "\tm=" + m + "\ta(il=" + il + ")=" + a(il) + "\ta(ir=" + ir + ")=" + a(ir) + "\tsum=" + sum);
    }
    return sum;
  }
}
