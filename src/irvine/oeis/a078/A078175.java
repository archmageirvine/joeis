package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078175 Numbers with an integer arithmetic mean of all prime factors.
 * @author Sean A. Irvine
 */
public class A078175 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SOPFR.z(++mN).mod(Functions.BIG_OMEGA.l(mN)) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
