package irvine.oeis.a066;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A066340 Fermat's triangle: T(n,m) = m^phi(n) mod n; n &gt;= 2; 1 &lt;= m &lt;= n-1, where phi is Euler's totient function.
 * @author Sean A. Irvine
 */
public class A066340 extends Sequence2 {

  private Z mN = Z.ONE;
  private Z mM = Z.ZERO;
  private Z mPhi = null;

  @Override
  public Z next() {
    mM = mM.add(1);
    if (mM.equals(mN)) {
      mN = mN.add(1);
      mPhi = Euler.phi(mN);
      mM = Z.ONE;
    }
    return mM.modPow(mPhi, mN);
  }
}
