package irvine.oeis.a384;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A384001 Irregular triangle T(n,j,k), j = 1..A024718(n), k = 1..n, where row 1 = {(0), (1)}, and row n = union of n-tuples whose sum s &lt; n, and the n-tuples formed by appending s to the (n-1)-tuples in row n-1.
 * @author Sean A. Irvine
 */
public class A384001 extends Sequence1 {

  protected List<List<Integer>> mRow = new ArrayList<>();
  private int mM = 0;
  private int mT = -1;

  private static final Comparator<List<Integer>> COMPARATOR = (a, b) -> {
    for (int k = 0; k < a.size(); ++k) {
      final int c = a.get(k).compareTo(b.get(k));
      if (c != 0) {
        return c;
      }
    }
    return 0;
  };

  // Form all n-tuples with sum < n adding them to next
  private void augment(final List<List<Integer>> next, final int n, final List<Integer> lst, final int sum) {
    if (lst.size() == n) {
      next.add(new ArrayList<>(lst));
      return;
    }
    for (int k = 0; k + sum < n; ++k) {
      lst.add(k);
      augment(next, n, lst, sum + k);
      lst.remove(lst.size() - 1);
    }
  }

  protected void step() {
    if (mRow.isEmpty()) {
      final ArrayList<Integer> z = new ArrayList<>();
      z.add(0);
      final ArrayList<Integer> o = new ArrayList<>();
      o.add(1);
      mRow.add(z);
      mRow.add(o);
    } else {
      // Compute the next row
      final int n = mRow.get(0).size() + 1;
      final List<List<Integer>> next = new ArrayList<>();
      augment(next, n, new ArrayList<>(), 0); // all n-tuples with sum < n
      for (final List<Integer> lst : mRow) {
        lst.add(n - IntegerUtils.sum(lst));
        next.add(lst);
      }
      next.sort(COMPARATOR); // enforce lexicographic ordering
      mRow = next;
    }
  }

  @Override
  public Z next() {
    if (mRow.isEmpty()) {
      step();
    }
    if (++mT >= mRow.get(mM).size()) {
      if (++mM >= mRow.size()) {
        step();
        mM = 0;
      }
      mT = 0;
    }
    return Z.valueOf(mRow.get(mM).get(mT));
  }
}

