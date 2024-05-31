package irvine.oeis.a027;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A027858 Triangle of "Harmonic Coefficients" T(n,k), read by rows: (Sum_{i=1..n} T(n,i) * k^i) * k! / ((n+k)! * n!) = (Sum_{i=1..k} (1/i-1/(i+n)) = n * (Sum_{i=1..k} 1/(i*(i+n)))).
 * @author Sean A. Irvine
 */
public class A027858 extends Sequence0 {

  private int mN = 0;
  private int mM = 0;
  private Z mF = Z.ONE;
  private Z mS = Z.ZERO;

  @Override
  public Z next() {
    if (++mM > mN) {
      mF = mF.multiply(++mN);
      mM = 1;
      mS = Z.ZERO;
      for (int k = 1; k <= mN; ++k) {
        mS = mS.add(mF.divide(k));
      }
    }
    return mS.multiply(Functions.STIRLING1.z(mN + 1, mM + 1).abs()).subtract(Functions.STIRLING1.z(mN + 1, mM + 2).abs().multiply(mM + 1).multiply(mF));
  }
}
