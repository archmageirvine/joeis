package irvine.oeis.a183;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A183184.
 * @author Sean A. Irvine
 */
public class A183186 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.TEN.pow(2 * mN + 1).subtract(Z.TEN.pow(mN).multiply(4)).subtract(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

