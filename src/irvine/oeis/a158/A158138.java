package irvine.oeis.a158;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A158138 Number of nondecreasing integer sequences of length 4 with sum zero and sum of absolute values 2n.
 * @author Georg Fischer
 */
public class A158138 implements Sequence {

  private int mLen;
  private int mN;

  /** Construct the sequence. */
  public A158138() {
    this(4);
  }

  /**
   * Generic constructor with parameter.
   * @param len length of nondecreasing sequence
   */
  public A158138(final int len) {
    mLen = len;
    mN = 0;
  }

  /* A008284 Number of partitons of n into exactly k parts
    part(n,k) = part(n-1,k-1) + part(n-k,k)
  */
  private final MemoryFunctionInt2<Z> mPartEq = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (n == 0 && k == 0) {
        return Z.ONE;
      }
      if ((n <= 0 || k <= 0) && (n != 0 || k != 0)) {
        return Z.ZERO;
      }
      return get(n - 1, k - 1).add(get(n - k, k));
    }
  };

  /* Maple:
    T := proc(n, k) option remember; # A026820, number of partitions of n into at most k parts.
          `if`(n=0 or k=1, 1, T(n, k-1) + `if`(k>n, 0, T(n-k, k)))
        end:
  */
  private final MemoryFunctionInt2<Z> mPartLe = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (n == 0 || k == 1) {
        return Z.ONE;
      }
      Z sum = get(n, k - 1);
      if (k <= n) {
        sum = sum.add(get(n - k, k));
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int m = 1; m < mLen; ++m) {
      sum = sum.add(mPartEq.get(mN, m).multiply(mPartLe.get(mN, mLen - m)));
    }
    return sum;
  }
}
