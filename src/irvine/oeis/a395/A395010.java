package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001190;
import irvine.util.array.DynamicArray;

/**
 * A395010 Sum of total path lengths over all unlabeled rooted unordered unary-binary trees with n nodes, where the root has exactly one child (except for n=1, where the tree is a single node with total path length 0), internal nodes have 1 or 2 children, and left/right are indistinguishable.
 * @author Sean A. Irvine
 */
public class A395010 extends Sequence1 {

  private final A001190 mW = new A001190();
  private final DynamicArray<Z> mC = new DynamicArray<>();
  private int mN = 0;

  private Z w(final int i) {
    return mW.a(i + 1);
  }

  private Z f(final int i, final int j) {
    assert i <= j;
    if (i == j) {
      return w(i).add(1).multiply(mC.get(i));
    }
    return w(i).multiply(mC.get(j)).add(w(j).multiply(mC.get(i)));
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      mC.set(1, Z.ONE);
      return Z.ZERO;
    }
    Z sum = mC.get(mN - 1);
    for (int i = 1; i <= (mN - 1) / 2; ++i) {
      sum = sum.add(f(i, mN - 1 - i));
    }
    mC.set(mN, sum.add(w(mN).multiply(mN)));
    return mC.get(mN - 1);
  }
}
