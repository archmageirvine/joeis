package irvine.oeis.a007;

import irvine.math.MemoryFunction3;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A007695 Cardinalities of Sperner families on 1,...,n.
 * @author Sean A. Irvine
 */
public class A007695 extends AbstractSequence {

  /** Construct the sequence. */
  public A007695() {
    this(0);
  }

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A007695(final int offset) {
    super(offset);
  }

  private final MemoryFunction3<Long, Z> mB = new MemoryFunction3<>() {
    // E function
    @Override
    protected Z compute(final Long p, final Long n, final Long k) {
      if (k > n || p < 0) {
        return Z.ZERO;
      }
      if (k == -1) {
        return Z.ONE;
      }
      if (k.equals(n)) {
        return Z.ONE;
      }
      if (n.equals(p)) {
        return get(p, p - 1, k);
      }
      Z sum = Z.ZERO;
      for (long i = k; i <= n; ++i) {
        sum = sum.add(get(p - 1, n, i).multiply(get(p - 1, i - 1, k - 1)));
      }
      return sum;
    }
  };

  protected Z f(final long p, final long n) {
    Z sum = Z.ZERO;
    for (long k = -1; k <= n; ++k) {
      sum = sum.add(mB.get(p, n, k));
    }
    return sum;
  }

  private long mN = -1;

  @Override
  public Z next() {
    return f(++mN, mN);
  }
}
