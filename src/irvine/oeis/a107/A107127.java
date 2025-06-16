package irvine.oeis.a107;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A107127 Numbers n such that (10^(2n+1)+54*10^n-1)/9 is prime.
 * @author Sean A. Irvine
 */
public class A107127 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.TEN.pow(2 * mN + 1).add(Z.TEN.pow(mN).multiply(54)).subtract(1).divide(9).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

