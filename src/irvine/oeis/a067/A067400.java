package irvine.oeis.a067;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067400 Non-uniquely factorizable OR-numbrals, i.e., numbrals for which there exist more than one different factorizations into irreducible factors (modulo order).
 * @author Sean A. Irvine
 */
public class A067400 extends Sequence1 {

  protected final Map<Integer, Set<Integer>> mDivisors = new HashMap<>();
  protected final ArrayList<Set<Set<Integer>>> mFactorizations = new ArrayList<>();
  private int mN = 1;
  {
    mFactorizations.add(null); // 0
    mFactorizations.add(Collections.emptySet()); // 1
  }

  protected boolean accept(final int n) {
    return mFactorizations.get(n).size() > 1;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Set<Set<Integer>> f = new HashSet<>();
      mFactorizations.add(f);
      for (int k = 1; k <= mN; ++k) {
        final int t = (int) LongUtils.numbralMultiply(k, mN);
        final Set<Integer> ds = mDivisors.computeIfAbsent(t, k1 -> new HashSet<>());
        ds.add(k);
        ds.add(mN);
      }
      for (int k : mDivisors.get(mN)) {
        for (int j : mDivisors.get(mN)) {
          final long t = LongUtils.numbralMultiply(k, j);
          if (t == mN) {
            for (final Set<Integer> a : mFactorizations.get(k)) {
              for (final Set<Integer> b : mFactorizations.get(j)) {
                final Set<Integer> c = new TreeSet<>(a);
                c.addAll(b);
                f.add(c);
              }
            }
          }
        }
      }
      if (f.isEmpty()) {
        f.add(Collections.singleton(mN)); // irreducible
      }
      if (accept(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
