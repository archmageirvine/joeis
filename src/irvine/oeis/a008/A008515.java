package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008515.
 * @author Sean A. Irvine
 */
public class A008515 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.add(1).pow(5).add(mN.pow(5));
  }
}

