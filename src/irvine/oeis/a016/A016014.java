package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A016014 Least k such that 2*n*k + 1 is a prime.
 * @author Sean A. Irvine
 */
public class A016014 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(2);
    long k = 0;
    while (true) {
      if (mN.multiply(++k).add(1).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
