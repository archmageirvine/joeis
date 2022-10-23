package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003816 a(0) = 0, a(n) = a(n-1) XOR -n.
 * @author Sean A. Irvine
 */
public class A003816 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    switch ((int) mN.mod(4)) {
      case 0:
        return Z.ZERO;
      case 1:
        return mN;
      case 2:
        return Z.NEG_ONE;
      default:
        return mN.add(1);
    }
  }
}
