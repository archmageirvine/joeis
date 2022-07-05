package irvine.oeis.a338;

import irvine.math.MemoryFunction1;
import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.SequenceWithOffset;

/**
 * A338585 Number of partitions of the n-th triangular number into exactly n positive triangular numbers.
 * @author Georg Fischer
 */
public class A338585 implements SequenceWithOffset {

  protected int mN;
  private int mOffset;

  /** Construct the sequence. */
  public A338585() {
    mOffset = 0;
    mN = mOffset - 1;
  }

  /* Maple:
    h:= proc(n) option remember; `if`(n<1, 0,
          `if`(issqr(8*n+1), n, h(n-1)))
        end:
    b:= proc(n, i, k) option remember; `if`(n=0, `if`(k=0, 1, 0),
          `if`(i*k<n or k>n, 0, b(n, h(i-1), k)+b(n-i, h(min(n-i, i)), k-1)))
        end:
    a:= n-> (t-> b(t, h(t), n))(n*(n+1)/2):
    seq(a(n), n=0..42);  # _Alois P. Heinz_, Nov 10 2020
  */
  /**
   * Compute the largest triangular number &lt;= n.
   * @param n parameter
   * @return largest k of the form <code>m*(m+1)/2 &lt;= n</code>
   */
  protected final MemoryFunction1<Integer> mH = new MemoryFunction1<Integer>() {
    @Override
    protected Integer compute(final int n) {
      if (n < 1) {
        return 0;
      }
      return Z.valueOf(8 * n + 1).isSquare() ? n : get(n - 1);
    }
  };

  protected final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<Z>() {
    @Override
    protected Z compute(final int n, final int i, final int k) {
      if (n == 0) {
        return k == 0 ? Z.ONE : Z.ZERO;
      }
      if (i * k < n || k > n) {
        return Z.ZERO;
      }
      return get(n, mH.get(i - 1), k).add(get(n - i, mH.get(i < n - i ? i : n - i), k - 1));
    }
  };

  @Override
  public int getOffset() {
    return mOffset;
  }

  @Override
  public Z next() {
    ++mN;
    final int t = mN * (mN + 1) / 2;
    return mB.get(t, mH.get(t), mN);
  }
}
