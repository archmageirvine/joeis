package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051711.
 * @author Sean A. Irvine
 */
public class A051711 implements Sequence {

  private long mN = -1;
  private Z mF = Z.TWO;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    } else if (mN == 1) {
      return Z.TWO;
    }
    mF = mF.multiply(mN).shiftLeft(2);
    return mF;
  }
}

