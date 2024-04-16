package irvine.oeis.a030;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030230 Numbers that have an odd number of distinct prime divisors.
 * @author Sean A. Irvine
 */
public class A030230 extends Sequence1 {

  private long mN = 0;
  
  @Override
  public Z next() {
    while (true) {
      if ((Functions.OMEGA.i(++mN) & 1) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
