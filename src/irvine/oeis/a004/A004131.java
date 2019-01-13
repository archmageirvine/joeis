package irvine.oeis.a004;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004131.
 * @author Sean A. Irvine
 */
public class A004131 implements Sequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final int[] mSeen = new int[1000000];
  private int mN = 1;

  private boolean search(final Set<Integer> set, final int nextValue, final int remaining, final int modulus) {
    if (nextValue + remaining - 1 <= modulus) {
      if (remaining == 0) {
        for (int k = 0; k < modulus; ++k) {
          if (mSeen[k] == 0) {
            return false;
          }
        }
        if (mVerbose) {
          System.out.println("Found: " + set);
        }
        return true;
      }
      for (int k = nextValue; k < modulus; ++k) {
        for (final int j : set) {
          mSeen[(j + k) % modulus]++;
        }
        set.add(k);
        final boolean res = search(set, k + 1, remaining - 1, modulus);
        set.remove(k);
        for (final int j : set) {
          mSeen[(j + k) % modulus]--;
        }
        if (res) {
          return true;
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    if (++mN == 2) {
      return Z.ONE;
    }
    final HashSet<Integer> set = new HashSet<>();
    set.add(0);
    set.add(1);
    mSeen[0] = 0;
    mSeen[1] = 1;
    int m = mN * (mN - 1) / 2; // Upper bound, search down from this
    while (!search(set, 2, mN - 2, m)) {
      --m;
    }
    return Z.valueOf(m);
  }
}
