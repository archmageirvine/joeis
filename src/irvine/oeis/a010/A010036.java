package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010036.
 * @author Sean A. Irvine
 */
public class A010036 implements Sequence {

  private Z mA = Z.ONE;
  private int mN = -2;

  @Override
  public Z next() {
    if (++mN >= 0) {
      mA = mA.multiply(4).add(Z.ONE.shiftLeft(mN));
    }
    return mA;
  }
}
