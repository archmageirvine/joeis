package irvine.oeis.a039;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionSequence;

/**
 * A039917 Number of orderings of 1,2,...,n^2 in an n X n matrix such that each row, each column and both diagonals are increasing.
 * @author Sean A. Irvine
 */
public class A039917 extends MemoryFunctionSequence<List<Integer>, Z> {

  /** Construct the sequence. */
  public A039917() {
    super(1);
  }

  // After Alois P. Heinz

  private int mN = 0;

  private boolean isZero(final List<Integer> l) {
    for (final int v : l) {
      if (v != 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  protected Z compute(final List<Integer> l) {
    if (isZero(l)) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    final int n = l.size();
    for (int i = 0; i < n; ++i) {
      if ((l.get(i) != n - i || i == 0 || l.get(i - 1) <= n - i)
        && l.get(i) > (i == n - 1 ? 0 : l.get(i + 1))) {
        // We need to make a copy to ensure the cache remains consistent
        final ArrayList<Integer> t = new ArrayList<>(l);
        t.set(i, l.get(i) - 1);
        sum = sum.add(get(t));
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    final List<Integer> lst = new ArrayList<>(++mN);
    for (int k = 0; k < mN; ++k) {
      lst.add(mN);
    }
    return get(lst);
  }
}
