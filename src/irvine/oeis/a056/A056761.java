package irvine.oeis.a056;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056761 Odd numbers less than the cube of their number of divisors.
 * @author Sean A. Irvine
 */
public class A056761 implements Sequence {

  private static final Z LAST = Z.valueOf(883575);
  private Z mN = Z.ONE;

  @Override
  public Z next() {
    if (LAST.equals(mN)) {
      return null;
    }
    while (true) {
      mN = mN.add(2);
      if (Cheetah.factor(mN).sigma0().pow(3).compareTo(mN) > 0) {
        return mN;
      }
    }
  }
}
