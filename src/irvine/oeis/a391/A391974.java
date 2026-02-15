package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391974 Numbers k such that (k*(k+1)*(k+2)*(k+3) + k + (k+1) + (k+2) + (k+3))/2 and (k*(k+1)*(k+2)*(k+3) - k - (k+1) - (k+2) - (k+3))/2 are both prime.
 * @author Sean A. Irvine
 */
public class A391974 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z prod = Z.valueOf(++mN).multiply(mN + 1).multiply(mN + 2).multiply(mN + 3).divide2();
      if (prod.add(2 * mN + 3).isProbablePrime() && prod.subtract(2 * mN + 3).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
