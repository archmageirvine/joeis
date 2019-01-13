package irvine.oeis.a187;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A187273.
 * @author Sean A. Irvine
 */
public class A187273 implements Sequence {

  private Z mThrees = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if ((++mN & 1) == 0) {
      return mThrees.multiply(2L * mN);
    } else {
      mThrees = mThrees.multiply(3);
      return mThrees.multiply(mN);
    }
  }
}
