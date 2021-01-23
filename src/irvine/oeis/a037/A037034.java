package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037034 Least k such that 4*n*k-1 is a prime.
 * @author Sean A. Irvine
 */
public class A037034 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(4);
    long k = 0;
    while (true) {
      if (mN.multiply(++k).subtract(1).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}

