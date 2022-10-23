package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A007917 Version 1 of the "previous prime" function: largest prime &lt;= n.
 * @author Sean A. Irvine
 */
public class A007917 extends Sequence2 {

  private Z mN = Z.ONE;
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.isPrime()) {
      mP = mN;
    }
    return mP;
  }
}
