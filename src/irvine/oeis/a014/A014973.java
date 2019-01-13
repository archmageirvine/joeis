package irvine.oeis.a014;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014973.
 * @author Sean A. Irvine
 */
public class A014973 implements Sequence {

  private Z mF = Z.ONE;
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    mF = mF.multiply(mN);
    return new Q(mF, mN.square()).den();
  }
}
