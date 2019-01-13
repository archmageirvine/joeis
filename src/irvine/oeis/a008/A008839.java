package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008839.
 * @author Sean A. Irvine
 */
public class A008839 implements Sequence {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (++mN > 0) {
        mA = mA.multiply(5);
      }
      if (mA.toString().indexOf('0') < 0) {
        return Z.valueOf(mN);
      }
    }
  }
}


