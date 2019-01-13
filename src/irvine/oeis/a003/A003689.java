package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003689.
 * @author Sean A. Irvine
 */
public class A003689 implements Sequence {

  private Z mThrees = Z.valueOf(128);
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN < 3) {
      return mN == 1 ? Z.THREE : Z.valueOf(30);
    }
    mThrees = mThrees.multiply(3);
    return mThrees.subtract(Z.valueOf(21L * mN + 57).shiftLeft(mN - 2));
  }
}
