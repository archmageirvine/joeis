package irvine.oeis.a063;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063479 Numbers k such that omega(k+1) = 2*omega(k), where omega is the number of distinct prime factors.
 * @author Sean A. Irvine
 */
public class A063479 extends Sequence1 {

  private long mN = 4;

  @Override
  public Z next() {
    while (true) {
      if (2 * Functions.OMEGA.i(++mN) == Functions.OMEGA.i(mN + 1)) {
        return Z.valueOf(mN);
      }
    }
  }
}
