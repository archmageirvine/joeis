package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002982.
 * @author Sean A. Irvine
 */
public class A002982 implements Sequence {

  private long mN = 1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mF = mF.multiply(++mN);
      if (mF.subtract(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
