package irvine.oeis.a004;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A004132 Modular postage stamp problem.
 * @author Sean A. Irvine
 */
public class A004132 extends Sequence2 {

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
        set.add(k);
        for (final int j : set) {
          mSeen[(j + k) % modulus]++;
        }
        final boolean res = search(set, k + 1, remaining - 1, modulus);
        for (final int j : set) {
          mSeen[(j + k) % modulus]--;
        }
        set.remove(k);
        if (res) {
          return true;
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    final HashSet<Integer> set = new HashSet<>();
    set.add(0);
    set.add(1);
    mSeen[0] = 1;
    ++mN;
    int m = mN * (mN + 1) / 2; // Upper bound, search down from this
    while (!search(set, 1, mN - 1, m)) {
      --m;
    }
    return Z.valueOf(m);
  }
}
