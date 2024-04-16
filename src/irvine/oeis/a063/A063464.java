package irvine.oeis.a063;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063464 Numbers k such that omega(k) = omega(k+2), where omega(k) is the number of distinct prime divisors of k.
 * @author Sean A. Irvine
 */
public class A063464 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.OMEGA.i(++mN) == Functions.OMEGA.i(mN + 2)) {
        return Z.valueOf(mN);
      }
    }
  }
}
