package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008599 Multiples of 17.
 * @author Sean A. Irvine
 */
public class A008599 implements Sequence {

  private Z mN = Z.valueOf(-17);

  @Override
  public Z next() {
    mN = mN.add(17);
    return mN;
  }
}

