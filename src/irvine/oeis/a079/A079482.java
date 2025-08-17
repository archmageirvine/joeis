package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A079482 Smallest number k such that k and k+1 have n and n+1 distinct prime divisors.
 * @author Sean A. Irvine
 */
public class A079482 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    long k = 1;
    while (true) {
      if (Functions.OMEGA.i(++k) == mN && Functions.OMEGA.i(k + 1) == mN + 1) {
        return Z.valueOf(k);
      }
    }
  }
}
