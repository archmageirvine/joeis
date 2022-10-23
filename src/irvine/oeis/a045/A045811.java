package irvine.oeis.a045;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A045811 In the list of divisors of n (in base 3), each digit 0-2 appears equally often.
 * @author Sean A. Irvine
 */
public class A045811 extends Sequence1 {

  private long mN = 0;

  protected int base() {
    return 3;
  }

  static boolean isConstant(final long[] cnt) {
    for (int k = 1; k < cnt.length; ++k) {
      if (cnt[k - 1] != cnt[k]) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final long[] cnt = new long[base()];
      for (final Z dd : Jaguar.factor(++mN).divisors()) {
        long d = dd.longValue();
        while (d != 0) {
          ++cnt[(int) (d % base())];
          d /= base();
        }
      }
      if (isConstant(cnt)) {
        return new Z(Long.toString(mN, base()));
      }
    }
  }
}

