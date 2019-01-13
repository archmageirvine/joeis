package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003486.
 * @author Sean A. Irvine
 */
public class A003486 implements Sequence {

  private long mN = -1;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mT = mT.multiply(3);
    }
    return mT.multiply(mN * mN + 1);
  }
}

