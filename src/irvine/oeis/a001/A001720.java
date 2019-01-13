package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001720.
 * @author Sean A. Irvine
 */
public class A001720 implements Sequence {

  private long mN = 3;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 4) {
      mA = mA.multiply(mN);
    }
    return mA;
  }

}
