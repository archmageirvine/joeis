package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002984.
 * @author Sean A. Irvine
 */
public class A002984 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    if (mN == null) {
      mN = Z.ONE;
    } else {
      mN = mN.add(mN.sqrt());
    }
    return mN;
  }
}
