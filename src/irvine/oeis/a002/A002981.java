package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002981 Numbers k such that k! + 1 is prime.
 * @author Sean A. Irvine
 */
public class A002981 implements Sequence {

  private long mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      if (++mN > 1) {
        mF = mF.multiply(mN);
      }
      if (mF.add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
