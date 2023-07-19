package irvine.oeis.a011;

import irvine.math.MemoryFunction3;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A011804 M-sequences from multicomplexes on at most 7 variables with no monomial of degree more than n-1.
 * @author Sean A. Irvine
 */
public class A011804 extends AbstractSequence {

  private long mN = start();

  /** Construct the sequence. */
  public A011804() {
    this(0);
  }

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A011804(final int offset) {
    super(offset);
  }

  private final MemoryFunction3<Long, Z> mB = new MemoryFunction3<>() {
    // L^p(n,k)
    @Override
    protected Z compute(final Long p, final Long n, final Long k) {
      if (n.equals(k) || k == -1) {
        return Z.ONE;
      }
      if (p == 0) {
        return Z.ZERO;
      }
      Z sum = Z.ZERO;
      for (long i = k; i <= n; ++i) {
        sum = sum.add(get(p - 1, n, i).multiply(get(p, i - 1, k - 1)));
      }
      return sum;
    }
  };

  protected long start() {
    return -1;
  }

  protected long variables() {
    return 7;
  }

  protected long min() {
    return -1;
  }

  protected Z m(final long p, final long n) {
    // M^p(n) = sum_{k=-1}^{n} L^p(n,k)
    Z sum = Z.ZERO;
    for (long k = min(); k <= n; ++k) {
      sum = sum.add(mB.get(p, n, k));
    }
    return sum;
  }

  @Override
  public Z next() {
    return m(variables(), ++mN);
  }
}
