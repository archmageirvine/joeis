package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004467.
 * @author Sean A. Irvine
 */
public class A004467 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(mN.square().multiply(11).subtract(5)).divide(6);
  }
}

