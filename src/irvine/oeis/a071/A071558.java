package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071531.
 * @author Sean A. Irvine
 */
public class A071558 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    long k = 0;
    while (true) {
      final Z nk = mN.multiply(++k);
      if (nk.subtract(1).isProbablePrime() && nk.add(1).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
