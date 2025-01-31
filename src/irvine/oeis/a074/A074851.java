package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074851 Numbers k such that k and k+1 both have exactly 2 distinct prime factors.
 * @author Sean A. Irvine
 */
public class A074851 extends Sequence1 {

  private long mN = 13;

  @Override
  public Z next() {
    while (true) {
      if (Functions.OMEGA.i(++mN) == 2 && Functions.OMEGA.i(mN + 1) == 2) {
        return Z.valueOf(mN);
      }
    }
  }
}
