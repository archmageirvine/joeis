package irvine.oeis.a069;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069219 Number of cyclic primes with n digits.
 * @author Sean A. Irvine
 */
public class A069219 extends Sequence1 {

  // Apart from n=1 case, only digits 1, 3, 7, 9 can appear.

  private int mN = 0;
  private long mCount = 0;

  private void search(final Z v, final int digit, final int least) {
    if (digit == mN) {
      if (v.isProbablePrime()) {
        Z u = v;
        final HashSet<Z> seen = new HashSet<>();
        do {
          u = Functions.ROTATE_RIGHT.z(u);
          if (u.compareTo(v) < 0 || !u.isProbablePrime()) {
            return;
          }
        } while (seen.add(u));
        mCount += seen.size();
      }
      return;
    }
    final Z t = v.multiply(10);
    if (least <= 1) {
      search(t.add(1), digit + 1, least);
    }
    if (least <= 3) {
      search(t.add(3), digit + 1, least);
    }
    if (least <= 7) {
      search(t.add(7), digit + 1, least);
    }
    search(t.add(9), digit + 1, least);
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.FOUR;
    }
    mCount = 0;
    // WLOG assume first digit is smallest
    search(Z.ONE, 1, 1);
    search(Z.THREE, 1, 3);
    search(Z.SEVEN, 1, 7);
    search(Z.NINE, 1, 9);
    return Z.valueOf(mCount);
  }
}

