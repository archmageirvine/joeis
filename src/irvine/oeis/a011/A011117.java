package irvine.oeis.a011;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011117 Triangle of numbers S(x,y) = number of lattice paths from <code>(0,0)</code> to <code>(x</code>,y) that use step set <code>{ (0,1), (1,0), (2,0), (3,0), </code>....} and never pass below y <code>= x</code>.
 * @author Sean A. Irvine
 */
public class A011117 extends MemoryFunction2<Integer, Z> implements Sequence {

  private int mN = -1;
  private int mM = 0;

  @Override
  protected Z compute(final Integer n, final Integer k) {
    if (k > n) {
      return Z.ZERO;
    }
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = get(n - 1, k);
    for (int j = 0; j < k; ++j) {
      sum = sum.add(get(n - 1, k - 1 - j).shiftLeft(j));
    }
    return sum;
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

