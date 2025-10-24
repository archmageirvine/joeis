package irvine.oeis.a389;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A389414 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A389414 extends Sequence1 {

  private long mN = 7;

  @Override
  public Z next() {
    while (true) {
      if (Functions.BIG_OMEGA.l(++mN) > 2 && Functions.GPF.z(mN).multiply2().compareTo(Functions.SOPFR.z(mN)) < 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

