package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393943 Triangle read by rows: T(n, k) is the coefficient of x^k in the unique (up to scale) degree-n polynomial P_n(x) with P_n(0) = 0 whose derivative P_n'(x) has zeros exactly at 1, 2, ..., n - 1.
 * @author Sean A. Irvine
 */
public class A393943 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private Z mLcm = Z.ONE;
  private Z[] mV = null;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
      mLcm = mLcm.lcm(mN);
      mV = new Z[mN];
      for (int k = 0; k < mV.length; ++k) {
        mV[k] = Functions.STIRLING1.z(mN, k + 1).multiply(mLcm.divide(k + 1));
      }
      final Z g = Functions.GCD.z(mV);
      for (int k = 0; k < mV.length; ++k) {
        mV[k] = mV[k].divide(g);
      }
    }
    return mV[mM - 1];
  }
}

