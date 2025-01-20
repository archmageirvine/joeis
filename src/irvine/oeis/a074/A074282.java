package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074282 Numbers k such that 10^999 + k is a (titanic) prime.
 * @author Sean A. Irvine
 */
public class A074282 extends Sequence1 {

  private static final Z TITAN = Z.TEN.pow(999);
  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (mN % 5 != 0 && TITAN.add(mN).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
