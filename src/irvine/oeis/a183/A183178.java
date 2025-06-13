package irvine.oeis.a183;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A183178 Numbers k such that 7*(10^(2*k+1)-1)/9 - 5*10^k is prime.
 * @author Sean A. Irvine
 */
public class A183178 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.TEN.pow(2 * mN + 1).subtract(1).divide(9).multiply(7).subtract(Z.TEN.pow(mN).multiply(5)).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

