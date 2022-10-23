package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002993 Initial digits of squares.
 * @author Sean A. Irvine
 */
public class A002993 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return Z.valueOf(mN.square().toString().charAt(0) - '0');
  }
}
