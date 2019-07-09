package irvine.oeis.a005;

import java.util.ArrayList;
import java.util.List;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000081;

/**
 * A005198 <code>a(n)</code> is the number of forests with <code>n</code> (unlabeled) nodes in which each component tree is planted, that is, is a rooted tree in which the root has degree 1.
 * @author Sean A. Irvine
 */
public class A005198 extends MemoryFunctionInt3<Z> implements Sequence {

  private final Sequence mA81 = new A000081();
  private final List<Z> mT = new ArrayList<>();
  {
    mT.add(null);
  }

  private Z getT(final int i) {
    while (i >= mT.size()) {
      mT.add(mA81.next());
    }
    return mT.get(i);
  }

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

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      sum = sum.add(get(mN, mN, k));
    }
    return sum;
  }
}
