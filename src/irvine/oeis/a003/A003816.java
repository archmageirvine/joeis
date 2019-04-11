package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003816 <code>a(0) = 0, a(n) = a(n-1)</code> XOR <code>-n</code>.
 * @author Sean A. Irvine
 */
public class A003816 implements Sequence {

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
