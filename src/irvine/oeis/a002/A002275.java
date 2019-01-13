package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002275.
 * @author Sean A. Irvine
 */
public class A002275 implements Sequence {

  private Z mN = null;

  protected long unit() {
    return 1;
  }

  @Override
  public Z next() {
    if (mN == null) {
      mN = Z.ZERO;
    } else {
      mN = mN.multiply(10).add(unit());
    }
    return mN;
  }
}
