package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003817 a(0) = 0, a(n) = a(n-1) OR n.
 * @author Sean A. Irvine
 */
public class A003817 implements Sequence {

  private Z mA = Z.ZERO;
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    mA = mA.or(mN);
    return mA;
  }
}
