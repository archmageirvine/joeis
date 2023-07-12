package irvine.oeis.a033;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000081;
import irvine.oeis.memory.MemoryFunctionInt3Sequence;

/**
 * A033185 Rooted tree triangle read by rows: a(n,k) = number of forests with n nodes and k rooted trees.
 * @author Sean A. Irvine
 */
public class A033185 extends MemoryFunctionInt3Sequence<Z> {

  /** Construct the sequence. */
  public A033185() {
    super(1);
  }

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
