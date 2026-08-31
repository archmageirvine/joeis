package irvine.oeis.a393;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A393643 Primes of the form x^^y + w^^z, where x, y, w, z &gt;= 2 and ^^ denotes tetration.
 * @author Sean A. Irvine
 */
public class A393643 extends Sequence1 {

  // After Marco Rip&agrave;

  private int mN = 0;
  private Z mLimit = Z.valueOf(32);
  private ArrayList<Z> mA = new ArrayList<>();

  private void extend() {
    final TreeSet<Z> v = new TreeSet<>();
    for (long r = 2; Z.valueOf(r).pow(r).compareTo(mLimit) < 0; ++r) {
      for (int s = 2; ; ++s) {
        final Z x = ZUtils.tetration(r, s, mLimit);
        if (x.compareTo(mLimit) >= 0) {
          break;
        }
        v.add(x);
      }
    }

    final Set<Z> sums = new HashSet<>();
    for (final Z x : v) {
      for (final Z y : v) {
        final Z z = x.add(y);
        if (z.compareTo(mLimit) >= 0) {
          break;
        }
        if (z.isProbablePrime()) {
          sums.add(z);
        }
        if (x.equals(y)) {
          break;
        }
      }
    }

    mA = new ArrayList<>(sums);
    Collections.sort(mA);
  }

  @Override
  public Z next() {
    ++mN;
    while (mA.size() <= mN) {
      extend();
      mLimit = mLimit.multiply2();
    }
    return mA.get(mN - 1);
  }
}
