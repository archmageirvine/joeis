package irvine.oeis.a086;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeSet;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086786 Triangle read by rows: n-th row is the smallest set of n numbers in arithmetic progression with the same prime signature.
 * @author Sean A. Irvine
 */
public class A086786 extends Sequence1 {

  private int mN = 0;
  protected LinkedList<Integer> mRow = new LinkedList<>();
  private final HashMap<Z, TreeSet<Integer>> mSigSets = new HashMap<>();
  private int mK = 0;

  private Collection<Integer> ap(final TreeSet<Integer> set) {
    if (set.size() < mN) {
      return null;
    }
    if (mN == 1) {
      return set; // trivial
    }
    if (mN == 2) {
      return set.size() == 2 ? set : null; // any two element list works
    }
    final int last = set.last();
    for (final int u : set) {
      final int d = last - u;
      if (d > 0 && last - d * (mN - 1) > 0) {
        boolean ok = true;
        for (int j = 2; j < mN; ++j) {
          final int e = last - d * j;
          if (e <= 1 || !set.contains(e)) {
            ok = false;
            break;
          }
        }
        if (ok) {
          final ArrayList<Integer> found = new ArrayList<>();
          for (int j = mN - 1; j >= 0; --j) {
            found.add(last - j * d);
          }
          return found;
        }
      }
    }
    return null;
  }

  protected void step() {
    ++mN;
    while (true) {
      final Z sig = FactorUtils.leastPrimeSignature(++mK);
      final TreeSet<Integer> lst = mSigSets.computeIfAbsent(sig, j -> new TreeSet<>());
      lst.add(mK);
      final Collection<Integer> ap = ap(lst);
      if (ap != null) {
        mRow.addAll(ap);
        break;
      }
    }
  }

  @Override
  public Z next() {
    if (mRow.isEmpty()) {
      step();
    }
    return Z.valueOf(mRow.pollFirst());
  }
}
