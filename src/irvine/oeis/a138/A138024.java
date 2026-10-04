package irvine.oeis.a138;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A138024 Triangle read by rows: T(n,k) = (n!/2) * [t^n*x^k] (1 - exp(2*x*t)*(t - 1)/(1 + t)), 0 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A138024 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    if (mN == 0) {
      return Z.ONE;
    }
    if (mM == mN) {
      return Z.ONE.shiftLeft(mN - 1);
    }
    return Functions.FACTORIAL.z(mN).divide(Functions.FACTORIAL.z(mM)).shiftLeft(mM).multiply(Z.NEG_ONE.pow(mN - mM));
  }
}
