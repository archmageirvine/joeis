package irvine.oeis.a140;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A140532 Number of primes with n distinct decimal digits, none of which are 0.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A140532 extends Sequence1 {

  private static final long[] SMALL = {4, 20, 83, 395, 1610, 5045, 12850, 23082};
  private int mN = 0;

  @Override
  public Z next() {
    if (mN >= SMALL.length) {
      return Z.ZERO;
    }
    return Z.valueOf(SMALL[mN++]);
  }
}
