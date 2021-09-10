package irvine.oeis.a051;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051389 Number of rational resistances requiring exactly n 1-ohm resistors in series or parallel.
 * @author Sean A. Irvine
 */
public class A051389 implements Sequence {

  private final TreeSet<Q> mSeen = new TreeSet<>();
  private final ArrayList<Set<Q>> mSolutions = new ArrayList<>();
  private int mN = 0;
  {
    mSolutions.add(Collections.emptySet());
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      mSolutions.add(Collections.singleton(Q.ONE));
      mSeen.add(Q.ONE);
      return Z.ONE;
    }
    long cnt = 0;
    final TreeSet<Q> set = new TreeSet<>();
    for (int k = 1; k <= mSolutions.size() / 2; ++k) {
      for (final Q a : mSolutions.get(k)) {
        for (final Q b : mSolutions.get(mSolutions.size() - k)) {
          final Q series = a.add(b);
          set.add(series);
          if (mSeen.add(series)) {
            ++cnt;
          }
          final Q parallel = a.reciprocal().add(b.reciprocal()).reciprocal();
          set.add(parallel);
          if (mSeen.add(parallel)) {
            ++cnt;
          }
        }
      }
    }
    mSolutions.add(set);
    return Z.valueOf(cnt);
  }
}

