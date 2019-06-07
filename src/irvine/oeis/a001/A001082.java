package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001082 Generalized octagonal numbers: <code>k*(3*k-2), k=0, +- 1, +- 2, +-3, ..</code>.
 * @author Sean A. Irvine
 */
public class A001082 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.isEven()
      ? mN.multiply(mN.multiply(3).subtract(4)).shiftRight(2)
      : mN.subtract(1).multiply(mN.multiply(3).add(1)).shiftRight(2);
  }
}

