package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002441.
 * @author Sean A. Irvine
 */
public class A002441 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return new Z(mN.square().toString(8));
  }
}
