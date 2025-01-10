package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074104 Smallest multiple of n such that every partial sum is a prime, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A074104 extends Sequence1 {

  private long mN = 0;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    if (++mN == 2) {
      return Z.ZERO;
    }
    long k = 0;
    while (true) {
      k += mN;
      final Z t = mSum.add(k);
      if (t.isProbablePrime()) {
        mSum = t;
        return Z.valueOf(k);
      }
    }
  }
}
