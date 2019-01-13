package irvine.oeis.a033;

import java.util.ArrayList;
import java.util.List;

import irvine.math.MemoryFunction3;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000081;

/**
 * A033185.
 * @author Sean A. Irvine
 */
public class A033185 extends MemoryFunction3<Integer, Z> implements Sequence {

  // After Alois P. Heinz

  private final Sequence mA55 = new A000081();
  private final List<Z> mT = new ArrayList<>();

  private Z getT(final int i) {
    if (i < 0) {
      return Z.ZERO;
    }
    while (i >= mT.size()) {
      mT.add(mA55.next());
    }
    return mT.get(i);
  }

  // b function
  @Override
  protected Z compute(final Integer n, final Integer i, final Integer p) {
    if (p > n) {
      return Z.ZERO;
    }
    if (n == 0) {
      return Z.ONE;
    }
    if (Math.min(i, p) < 1) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (int j = 0; j <= Math.min(n / i, p); ++j) {
      sum = sum.add(get(n - i * j, i - 1, p - j).multiply(Binomial.binomial(getT(i).longValueExact() + j - 1, j)));
    }
    return sum;
  }

  private int mN = 0;
  private int mK = 0;

  @Override
  public Z next() {
    if (++mK > mN) {
      ++mN;
      mK = 1;
    }
    return get(mN, mN, mK);
  }
}
