package irvine.oeis.a005;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005421 Number of numbers of complexity n, i.e., that can be built from n ones using + and *, and require at least that many ones.
 * @author Sean A. Irvine
 */
public class A005421 implements Sequence {

  private HashSet<Z> mSeen = new HashSet<>();
  private final ArrayList<Set<Z>> mByComplexity = new ArrayList<>();
  private int mN = 1;

  @Override
  public Z next() {
    if (mSeen.isEmpty()) {
      mSeen.add(Z.ONE);
      mByComplexity.add(null);
      mByComplexity.add(Collections.singleton(Z.ONE));
      return Z.ONE;
    }
    ++mN;
    final HashSet<Z> next = new HashSet<>();
    for (final Z v : mByComplexity.get(mByComplexity.size() - 1)) {
      final Z u = v.add(1);
      if (!mSeen.contains(u)) {
        next.add(u);
      }
    }
    for (int complexity = 1; complexity <= mN / 2; ++complexity) {
      // * combos
      for (final Z v : mByComplexity.get(complexity)) {
        for (final Z u : mByComplexity.get(mN - complexity)) {
          final Z p = u.multiply(v);
          if (!mSeen.contains(p)) {
            next.add(p);
          }
        }
      }
    }
    mByComplexity.add(next);
    mSeen.addAll(next);
    return Z.valueOf(next.size());
  }
}
