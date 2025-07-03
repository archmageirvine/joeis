package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078511 Numbers k such that sopfr(k)=tau(k).
 * @author Sean A. Irvine
 */
public class A078511 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SOPFR.l(++mN) == Functions.SIGMA0.l(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

