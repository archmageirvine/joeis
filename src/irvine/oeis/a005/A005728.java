package irvine.oeis.a005;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005728.
 * @author Sean A. Irvine
 */
public class A005728 implements Sequence {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.add(LongUtils.phi(mN));
    }
    return mA;
  }
}

