package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076803 Smallest multiple of n which is a reverse concatenation of n nonnegative consecutive numbers, or 0 if no such multiple exists.
 * @author Sean A. Irvine
 */
public class A076803 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    long s = mN - 2;
    while (true) {
      ++s;
      final StringBuilder sb = new StringBuilder();
      for (long k = s, j = 0; j < mN; ++j, --k) {
        sb.insert(0, k);
      }
      final Z t = new Z(sb.reverse());
      if (t.mod(mN) == 0) {
        return t;
      }
    }
  }
}

