package irvine.oeis.a000;

import java.util.ArrayList;
import java.util.List;

import irvine.math.api.Set;
import irvine.math.set.IntegerSet;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000372 Dedekind numbers or Dedekind's problem: number of monotone Boolean functions of n variables, number of antichains of subsets of an <code>n-set</code>, number of elements in a free distributive lattice on n generators, number of Sperner families.
 * @author Sean A. Irvine
 */
public class A000372 implements Sequence {

  // Only good for about 7 terms

  private int mN = -1;
  private long mCount = 0;
  private List<Set<Integer>> mPowerSet = null;

  private boolean isIncomparable(final List<Set<Integer>> antichain, final Set<Integer> set) {
    for (final Set<Integer> a : antichain) {
      if (set.isSubset(a) || a.isSubset(set)) {
        return false;
      }
    }
    return true;
  }

  private void count(final List<Set<Integer>> antichain, final int n) {
    if (n >= mPowerSet.size()) {
      ++mCount;
      return;
    }
    // Choose not to include element n
    count(antichain, n + 1);
    // Choose to include element n if allowed
    final Set<Integer> s = mPowerSet.get(n);
    if (isIncomparable(antichain, s)) {
      antichain.add(s);
      count(antichain, n + 1);
      antichain.remove(antichain.size() - 1);
    }
  }

  private List<Set<Integer>> powerSetList(final int n) {
    // Convert power set to simple list so can index elements
    final Set<Set<Integer>> ps = new IntegerSet(1, n).powerset();
    final ArrayList<Set<Integer>> psl = new ArrayList<>(ps.size().intValueExact());
    for (final Set<Integer> s : ps) {
      psl.add(s);
    }
    return psl;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.TWO;
    }
    mCount = 0;
    mPowerSet = powerSetList(mN);
    count(new ArrayList<>(), 0);
    return Z.valueOf(mCount);
  }
}
