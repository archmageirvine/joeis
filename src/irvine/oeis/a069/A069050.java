package irvine.oeis.a069;

import irvine.math.LongUtils;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069044.
 * @author Sean A. Irvine
 */
public class A069050 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long phi = Euler.phiAsLong(++mN);
      if (LongUtils.modPow(2, mN, phi) == LongUtils.modPow(2, phi, mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

