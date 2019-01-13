package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008468.
 * @author Sean A. Irvine
 */
public class A008468 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.pow(3).or(mN);
  }
}
