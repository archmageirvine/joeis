package irvine.oeis.a045;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A045768 Numbers k such that sigma(k) == 2 (mod k).
 * @author Sean A. Irvine
 */
public class A045768 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN == 1 || Functions.SIGMA.z(mN).mod(mN) == 2) {
        return Z.valueOf(mN);
      }
    }
  }
}
