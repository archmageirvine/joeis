package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A035093 Smallest k such that k*n! + 1 is prime.
 * @author Sean A. Irvine
 */
public class A035093 extends Sequence1 {

  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    Z k = Z.ZERO;
    while (true) {
      k = k.add(1);
      if (k.multiply(mF).add(1).isProbablePrime()) {
        return k;
      }
    }
  }
}
