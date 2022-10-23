package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A008344 a(1)=0; thereafter a(n+1) = a(n) - n if a(n) &gt;= n otherwise a(n+1) = a(n) + n.
 * @author Sean A. Irvine
 */
public class A008344 extends Sequence1 {

  private Z mA = Z.ZERO;
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.signum() > 0) {
      mA = mA.signedAdd(mA.compareTo(mN) < 0, mN);
    }
    return mA;
  }
}


