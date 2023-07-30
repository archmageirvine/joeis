package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A064829 Smallest number greater than 1 which ends in an odd digit in bases 2 through n.
 * @author Sean A. Irvine
 */
public class A064829 extends Sequence2 {

  private long mN = 1;
  private long mM = 3;

  private boolean is(final long m, final long n) {
    for (long b = n; b > 1; --b) {
      if (((m % b) & 1) == 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (true) {
      if (is(mM, mN)) {
        return Z.valueOf(mM);
      }
      mM += 2;
    }
  }
}
