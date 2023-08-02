package irvine.oeis.a262;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A262554 Triangle read by rows: coefficients in Bell's formula for number of ways of making change when coins have denominations which are powers of 2.
 * @author Sean A. Irvine
 */
public class A262554 extends MemoryFunction2Sequence<Integer, Z> {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A262554(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A262554() {
    super(1);
  }

  private Z a(final int i, final int j) {
    return Binomial.binomial(i, j - i).shiftLeft(2L * i - j).add(Binomial.binomial(i - 1, j - i + 1).shiftLeft(2L * i - j - 2));
  }

  @Override
  protected Z compute(final Integer m, final Integer i) {
    if (i >= m) {
      return Z.ZERO;
    }
    if (i == 0) {
      return Z.ONE;
    }
    Z s = Z.ZERO;
    for (int j = i - 1; j <= 2 * i; ++j) {
      s = s.add(a(i, j).multiply(get(m - 1, j)));
    }
    return s;
  }

  private int mN = 0;
  private int mI = 0;

  @Override
  public Z next() {
    if (++mI >= mN) {
      ++mN;
      mI = 0;
    }
    return get(mN, mI);
  }

}

