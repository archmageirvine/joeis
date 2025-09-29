package irvine.oeis.a080;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.math.MemoryFunction1;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080743 Array read by rows in which n-th row lists orders of elements of Symm(n) that are not orders of elements of Symm(n-1) (6th row is empty, written as 0 by convention).
 * @author Sean A. Irvine
 */
public class A080743 extends Sequence1 {

  // After Alois P. Heinz

  private int mN = 0;
  private int mM = 0;
  private List<Z> mRow = Collections.emptyList();
  private final MemoryFunction1<Set<Z>> mB = new MemoryFunction1<>() {
    @Override
    protected Set<Z> compute(final int n) {
      if (n < 3) {
        return Collections.singleton(Z.valueOf(n));
      }
      final Set<Z> res = new HashSet<>();
      res.add(Z.valueOf(n));
      for (int i = 2; i < n; ++i) {
        for (final Z v : get(n - i)) {
          res.add(Functions.LCM.z(v, i));
        }
      }
      for (int i = 1; i < n; ++i) {
        res.removeAll(get(i));
      }
      return res;
    }
  };

  protected List<Z> t(final int n) {
    final Set<Z> res = mB.get(n);
    if (res.size() == 0) {
      return Collections.singletonList(Z.ZERO);
    }
    final ArrayList<Z> lst = new ArrayList<>(res.size());
    lst.addAll(res);
    Collections.sort(lst);
    return lst;
  }

  @Override
  public Z next() {
    if (++mM >= mRow.size()) {
      mRow = t(++mN);
      mM = 0;
    }
    return mRow.get(mM);
  }
}
