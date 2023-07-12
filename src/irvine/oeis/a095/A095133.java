package irvine.oeis.a095;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000055;
import irvine.oeis.memory.MemoryFunctionInt3Sequence;

/**
 * A095133 Triangle of numbers of forests on n nodes containing k trees.
 * @author Sean A. Irvine
 */
public class A095133 extends MemoryFunctionInt3Sequence<Z> {

  /** Construct the sequence. */
  public A095133() {
    super(1);
  }

  private final Sequence mA55 = new A000055();
  private final List<Z> mT = new ArrayList<>();

  private Z getT(final int i) {
    while (i >= mT.size()) {
      mT.add(mA55.next());
    }
    return mT.get(i);
  }

  // g function
  @Override
  protected Z compute(final int n, final int i, final int p) {
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
      sum = sum.add(get(n - i * j, i - 1, p - j).multiply(Binomial.binomial(getT(i).add(j - 1), Z.valueOf(j))));
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
