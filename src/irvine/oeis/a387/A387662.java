package irvine.oeis.a387;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A387662 allocated for Alex Ratushnyak.
 * @author Sean A. Irvine
 */
public class A387662 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    long s = 0;
    while (true) {
      final long t = LongUtils.modPow(++k, k, mN);
      s += t;
      s %= mN;
      if (s == 0) {
        return Z.valueOf(k);
      }
    }
  }
}
