package irvine.oeis.a008;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008964 Number of elements of order <code>&lt;= 2</code> in group of <code>n X n</code> upper triangular matrices over <code>GF(2)</code>.
 * @author Sean A. Irvine
 */
public class A008964 extends MemoryFunction2<Integer, Z> implements Sequence {

  // See Involutions and Characters of Upper Triangular Matrix Groups
  // I. M. Isaac and Dikran B. Karagueuzian

  private int mN = 0;

  @Override
  protected Z compute(final Integer n, final Integer r) {
    if (r == 0) {
      return Z.ONE;
    }
    if (n == 1) {
      return Z.ZERO;
    }
    return get(n - 1, r).shiftLeft(r).add(get(n - 1, r - 1).multiply(Z.ONE.shiftLeft(n - r).subtract(Z.ONE.shiftLeft(r - 1))));
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int r = 0; r <= mN / 2; ++r) {
      sum = sum.add(get(mN, r));
    }
    return sum;
  }
}

