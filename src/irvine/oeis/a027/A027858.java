package irvine.oeis.a027;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027858 Triangle of "Harmonic Coefficients" <code>T(j,k)</code>, read by rows: <code>(sum:n=1</code> to j: <code>T(j,n)*k^n)*k!/((j+k)!*j!) =(sum:n=1</code> to <code>k:(1/n-1/(n+j)) =j*(sum:n=1</code> to <code>k:1/(n*(n+j))))</code>.
 * @author Sean A. Irvine
 */
public class A027858 implements Sequence {

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
    return mS.multiply(Stirling.firstKind(mN + 1, mM + 1).abs()).subtract(Stirling.firstKind(mN + 1, mM + 2).abs().multiply(mM + 1).multiply(mF));
  }
}
