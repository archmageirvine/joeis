package irvine.oeis.a045;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045812 Number of times the digits are repeated in A045811.
 * @author Sean A. Irvine
 */
public class A045812 implements Sequence {

  private long mN = 0;

  protected int base() {
    return 3;
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
      if (A045811.isConstant(cnt)) {
        return Z.valueOf(cnt[0]);
      }
    }
  }
}

