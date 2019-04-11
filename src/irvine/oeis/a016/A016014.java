package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016014 Least k such that <code>2*n*k + 1</code> is a prime.
 * @author Sean A. Irvine
 */
public class A016014 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    long k = 0;
    while (true) {
      ++k;
      if (mN.multiply(2 * k).add(1).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
