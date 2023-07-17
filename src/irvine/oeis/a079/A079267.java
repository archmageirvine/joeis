package irvine.oeis.a079;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A079267 d(n,s) = number of perfect matchings on {1, 2, ..., n} with s short pairs.
 * @author Sean A. Irvine
 */
public class A079267 extends MemoryFunction2Sequence<Integer, Z> {

  /** Construct the sequence. */
  public A079267() {
    this(0);
  }

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A079267(final int offset) {
    super(offset);
  }

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;
  private int mM = 0;

  @Override
  protected Z compute(final Integer n, final Integer s) {
    Z sum = Z.ZERO;
    for (int h = s; h <= n; ++h) {
      sum = sum.signedAdd(((h - s) & 1) == 0, mF.factorial(2 * n - h).shiftRight(n - h).divide(mF.factorial(n - h)).divide(mF.factorial(h - s)));
    }
    return sum.divide(mF.factorial(s));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}
