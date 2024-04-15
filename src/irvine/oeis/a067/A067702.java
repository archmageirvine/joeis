package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067702 Numbers k such that sigma(k) == 0 (mod k+2).
 * @author Sean A. Irvine
 */
public class A067702 extends Sequence1 {

  private long mN = 11;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA.z(++mN).mod(mN + 2) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
