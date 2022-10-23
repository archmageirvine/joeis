package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003815 a(0) = 0, a(n) = a(n-1) XOR n.
 * @author Sean A. Irvine
 */
public class A003815 extends Sequence0 {

  private Z mA = Z.ZERO;
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    mA = mA.xor(mN);
    return mA;
  }
}
