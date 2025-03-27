package irvine.oeis.a076;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A076261 Triangle T(n,k) (n &gt;= 2, 1 &lt;= k &lt;= n-1) read by rows, where T(n,k) is the number of words of length n in the free group on two generators that require exactly k multiplications for their formation.
 * @author Sean A. Irvine
 */
public class A076261 extends Sequence2 {

  // Brute force and hard on memory

  private int mN = 1;
  private int mM = 0;
  private Set<Set<String>> mSets = null;
  private final Set<String> mSeen = new HashSet<>();

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 1;
      mSeen.clear();
      mSets = new HashSet<>();
      mSets.add(Set.of("a", "b")); // Start with a single set containing elements needing no multiplication
    }
    // For each existing set, consider each possible multiplication of 2 elements within that set.
    // Retain if the multiplied word is not already in the set and not longer than mN
    // Keep track of the first time we see words of length mN
    int cnt = 0;
    // If we've already seen every word of length n, there is no point in searching further
    if (mSeen.size() < (1 << mN)) {
      final Set<Set<String>> next = new HashSet<>();
      for (final Set<String> set : mSets) {
        for (final String s : set) {
          for (final String t : set) {
            final String u = s + t;
            if (u.length() == mN) {
              if (mSeen.add(u)) {
                ++cnt;
              }
            } else if (u.length() < mN && !set.contains(u)) {
              final Set<String> c = new HashSet<>(set);
              c.add(u);
              next.add(c);
            }
          }
        }
      }
      mSets = next;
    }
    return Z.valueOf(cnt);
  }
}
