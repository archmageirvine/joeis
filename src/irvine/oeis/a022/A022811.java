package irvine.oeis.a022;

import irvine.math.MemoryFunction3;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A022811 Number of terms in n-th derivative of a function composed with itself 3 times.
 * @author Sean A. Irvine
 */
public class A022811 extends MemoryFunction2Sequence<Long, Z> {

  /** Construct the sequence. */
  public A022811() {
    this(0);
  }

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A022811(final int offset) {
    super(offset);
  }

  // After Jean-Fran&ccedil;ois Alcover, after Alois P. Heinz

  private final MemoryFunction3<Long, Z> mB = new MemoryFunction3<>() {
    @Override
    protected Z compute(final Long n, final Long i, final Long k) {
      if (n < k) {
        return Z.ZERO;
      }
      if (n == 0) {
        return Z.ONE;
      }
      if (i < 1) {
        return Z.ZERO;
      }
      Z sum = Z.ZERO;
      for (long j = 0; j <= Math.min(n / i, k); ++j) {
        sum = sum.add(get(n - i * j, i - 1, k - j));
      }
      return sum;
    }
  };

  private long mN = -1;

  @Override
  protected Z compute(final Long n, final Long k) {
    if (k == 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (long i = 0; i <= n; ++i) {
      sum = sum.add(mB.get(n, n, i).multiply(get(i, k - 1)));
    }
    return sum;
  }

  @Override
  public Z next() {
    return get(++mN, 3L);
  }
}
