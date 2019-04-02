package irvine.oeis.a004;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004136 Additive bases: a(n) is the least integer k such that in the cyclic group Z_k there is a subset of n elements all pairs (of not necessarily distinct elements) of which add up to a different sum (in Z_k).
 * @author Sean A. Irvine
 */
public class A004136 implements Sequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;

  private boolean search(final Set<Integer> set, final int nextValue, final int remaining, final boolean[] seen) {
    final int modulus = seen.length;
    if (nextValue + remaining - 1 <= modulus) {
      if (remaining == 0) {
        if (mVerbose) {
          System.out.println("Found: " + set);
        }
        return true;
      }
      modulus:
      for (int k = nextValue; k < modulus; ++k) {
        if (!seen[k]) { // Efficiency, since 0 is always a member
          set.add(k);
          for (final int j : set) {
            final int t = (j + k) % modulus;
            if (seen[t]) {
              for (final int i : set) {
                if (i == j) {
                  break;
                }
                seen[(i + k) % modulus] = false;
              }
              set.remove(k);
              continue modulus;
            }
            seen[t] = true;
          }
          final boolean res = search(set, k + 1, remaining - 1, seen);
          for (final int j : set) {
            seen[(j + k) % modulus] = false;
          }
          set.remove(k);
          if (res) {
            return true;
          }
        }
      }
    }
    return false;
  }

  private static boolean[] makeInitialSeen(final int m) {
    final boolean[] seen = new boolean[m];
    seen[0] = true;
    return seen;
  }

  @Override
  public Z next() {
    final HashSet<Integer> set = new HashSet<>();
    set.add(0);
    ++mN;
    int m = Math.max(1, mN * (mN - 1) / 2); // Lower bound, search up from this
    while (!search(set, 1, mN - 1, makeInitialSeen(m))) {
      ++m;
    }
    return Z.valueOf(m);
  }
}
