package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a001.A001187;

/**
 * A054592 Number of disconnected labeled graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A054592 extends A001187 {

  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(mN * (mN + 1) / 2).subtract(super.next());
  }
}
