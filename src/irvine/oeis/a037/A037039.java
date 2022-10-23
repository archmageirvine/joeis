package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A037039 Least k such that 4*n*k+1 is a prime.
 * @author Sean A. Irvine
 */
public class A037039 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(4);
    long k = 0;
    while (true) {
      if (mN.multiply(++k).add(1).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
