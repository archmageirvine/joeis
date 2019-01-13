package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008486.
 * @author Sean A. Irvine
 */
public class A008486 implements Sequence {

  private Z mN = Z.valueOf(-3);

  @Override
  public Z next() {
    mN = mN.add(3);
    return mN.signum() > 0 ? mN : Z.ONE;
  }
}
