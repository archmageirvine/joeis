package irvine.oeis.a183;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A183181 Numbers k such that (7*10^(2*k+1) - 9*10^k - 7)/9 is prime.
 * @author Sean A. Irvine
 */
public class A183181 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.TEN.pow(2 * mN + 1).multiply(7).subtract(Z.TEN.pow(mN).multiply(9)).subtract(7).divide(9).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

