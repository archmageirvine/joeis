package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004302.
 * @author Sean A. Irvine
 */
public class A004302 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().multiply(mN.add(1).square()).multiply(mN.add(2)).divide(12);
  }
}

