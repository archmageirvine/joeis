package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002467.
 * @author Sean A. Irvine
 */
public class A002467 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(mN).signedAdd((mN & 1) == 1, Z.ONE);
    }
    return mA;
  }
}
