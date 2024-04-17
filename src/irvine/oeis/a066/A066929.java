package irvine.oeis.a066;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066929 Numbers n such that Omega(n) = floor(log(n)).
 * @author Sean A. Irvine
 */
public class A066929 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (CR.valueOf(++mN).log().floor().longValue() == Functions.BIG_OMEGA.l(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
