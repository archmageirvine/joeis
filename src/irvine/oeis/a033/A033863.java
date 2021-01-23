package irvine.oeis.a033;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicArray;
import irvine.util.array.DynamicLongArray;

/**
 * A033863 Least number of Sort-then-add persistence n.
 * @author Sean A. Irvine
 */
public class A033863 implements Sequence {

  // Some values (e.g. 316) appear to not terminate, so we cannot simply run
  // each number until a solution is found.  Also, the sequences is not
  // monotonically increasing.  Therefore we do a dovetail-style calculation
  // expanding the current value for various starting points until either
  // they terminate or the value for a(n) is discovered.

  private static class State {
    private Z mValue;
    private int mIndex;
  }

  private final DynamicLongArray mLeastSolution = new DynamicLongArray();
  protected final DynamicArray<Z> mLeastSolutionValue = new DynamicArray<>(); // For A033864
  private final TreeMap<Long, State> mInProgress = new TreeMap<>();
  protected int mN = -1;
  private long mM = 0; // Last value started to far

  // A lot of chains coalesce, so keep track of previously computed values
  //private final TreeMap<Z, Z> mCache = new TreeMap<>();

  private Z sortDigits(final Z v) {
    return ZUtils.sortDigitsAscending(v);

    // Following option is likely faster, but uses a lot of memory
//    if (v.bitLength() < 60) {
//      // Don't bother remembering small results
//      return ZUtils.sortDigitsAscending(v);
//    }
//    final Z res = mCache.get(v);
//    if (res != null) {
//      return res;
//    }
//    final Z t = ZUtils.sortDigitsAscending(v);
//    mCache.put(v, t);
//    return t;
  }

  @Override
  public Z next() {
    ++mN;
    while (mLeastSolution.get(mN) == 0) {
      // We have yet to discover the solution

      // Try expanding numbers already in progress first
      outer:
      for (final Iterator<Map.Entry<Long, State>> it = mInProgress.entrySet().iterator(); it.hasNext();) {
        final Map.Entry<Long, State> e = it.next();
        final State s = e.getValue();
        while (s.mIndex < mM) {
          ++s.mIndex;
          final Z t = sortDigits(s.mValue);
          if (t.equals(s.mValue)) {
            if (mLeastSolution.get(s.mIndex) == 0) {
              mLeastSolution.set(s.mIndex, e.getKey());
              mLeastSolutionValue.set(s.mIndex, t);
            }
            it.remove(); // this start value is now solved
            if (s.mIndex == mN) {
              break outer;
            }
            break;
          } else {
            s.mValue = s.mValue.add(t);
          }
        }
      }

      while (mLeastSolution.get(mN) == 0) {
        // Solution must be larger than any value previously tried
        Z a = Z.valueOf(++mM);
        boolean solved = false;
        for (int k = 0; k <= mN; ++k) {
          final Z t = sortDigits(a);
          if (t.equals(a)) {
            if (mLeastSolution.get(k) == 0) {
              mLeastSolution.set(k, mM);
              mLeastSolutionValue.set(k, t);
            }
            solved = true;
            break;
          } else {
            a = a.add(t);
          }
        }
        if (!solved) {
          final State s = new State();
          s.mValue = a;
          s.mIndex = mN;
          mInProgress.put(mM, s);
        }
      }
    }
    return Z.valueOf(mLeastSolution.get(mN));
  }
}
