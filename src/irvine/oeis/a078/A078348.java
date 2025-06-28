package irvine.oeis.a078;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A078348 Primes p such that every decimal digit d in p appears exactly d times.
 * @author Sean A. Irvine
 */
public class A078348 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private int mN = 3;

  private void populate(final int sum, final int prev, final int set) {
    if (sum == 0) {
      final int[] digits = new int[mN];
      for (int k = 1, j = 0; j < mN; ++k) {
        if ((set & (1 << k)) != 0) {
          for (int i = 0; i < k; ++i) {
            digits[j++] = k;
          }
        }
      }
      final Permutation perm = new Permutation(digits);
      int[] p;
      while ((p = perm.next()) != null) {
        if ((p[p.length - 1] & 1) == 1) { // Save a bit of time, don't look at even numbers
          final Z v = Permutation.permToZ(p);
          if (v.isProbablePrime()) {
            mA.add(v);
          }
        }
      }
      return;
    }
    for (int k = Math.min(prev - 1, sum); k > 0; --k) {
      populate(sum - k, k, set | (1 << k));
    }
  }

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      populate(++mN, mN + 1, 0);
    }
    return mA.pollFirst();
  }
}

