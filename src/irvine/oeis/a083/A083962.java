package irvine.oeis.a083;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083962 Smallest palindromic multiple of n containing the digit string of a(n-1); or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A083962 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN % 10 == 0) {
      mA = Z.ZERO;
      return Z.ZERO;
    }
    if (!mA.isZero() && mA.mod(mN) == 0) {
      return mA;
    }
    if (mN > 1) {
      final String s = mA.toString();
      long k = 0;
      long j = 0;
      final TreeSet<Z> set = new TreeSet<>();
      while (set.isEmpty() || k < 10 * j) {
        final String sk = String.valueOf(++k);
        final String rk = new StringBuilder(sk).reverse().toString();
        final Z t = new Z(sk + s + rk);
        if (t.mod(mN) == 0) {
          set.add(t);
        }
        if (s.length() == 1) {
          final Z u = new Z(sk + s + s + rk);
          if (u.mod(mN) == 0) {
            if (j == 0) {
              j = k;
            }
            set.add(u);
          }
        }
      }
      mA = set.first();
    }
    return mA;
  }
}
