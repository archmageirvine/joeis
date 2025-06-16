package irvine.oeis.a183;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A183185 Numbers n such that 10^(2n+1)-5*10^n-1 is prime.
 * @author Sean A. Irvine
 */
public class A183185 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.TEN.pow(2 * mN + 1).subtract(Z.TEN.pow(mN).multiply(5)).subtract(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

