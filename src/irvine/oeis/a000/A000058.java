package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000058.
 * @author Sean A. Irvine
 */
public class A000058 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    if (mN == null) {
      mN = Z.TWO;
    } else {
      mN = mN.square().subtract(mN).add(1);
    }
    return mN;
  }
}

