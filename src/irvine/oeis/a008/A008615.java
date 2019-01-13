package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008615.
 * @author Sean A. Irvine
 */
public class A008615 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.divide2().subtract(mN.divide(3));
  }
}

