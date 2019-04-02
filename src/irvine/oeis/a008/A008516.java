package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008516 6-dimensional centered cube numbers.
 * @author Sean A. Irvine
 */
public class A008516 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.add(1).pow(6).add(mN.pow(6));
  }
}

