package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.a005.A005117;

/**
 * A070321 Greatest squarefree number &lt;= n.
 * @author Sean A. Irvine
 */
public class A070321 extends A005117 {

  private Z mN = Z.ZERO;
  private Z mA = Z.ZERO;
  private Z mT = super.next();

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.equals(mT)) {
      mA = mT;
      mT = super.next();
    }
    return mA;
  }
}
