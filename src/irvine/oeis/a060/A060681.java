package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060681 Largest difference between consecutive divisors of n (ordered by size).
 * @author Sean A. Irvine
 */
public class A060681 extends Sequence1 {

  protected long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    if ((mN & 1) == 0) {
      return Z.valueOf(mN - (mN >>> 1));
    } else {
      // Essentially trial division to find least prime factor
      long k = 3;
      while (mN % k != 0) {
        k += 2;
      }
      return Z.valueOf(mN - mN / k);
    }
  }
}

