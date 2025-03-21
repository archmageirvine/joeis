package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076120 a(n) = smallest multiple of n other than n which is relatively prime to both a(n-1) and a(n+1).
 * @author Sean A. Irvine
 */
public class A076120 extends Sequence1 {

  private Z mA = Z.THREE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      long k = mN;
      while (true) {
        k += mN;
        if (Functions.GCD.l(mA, k) == 1 && Functions.GCD.l(k, mN + 1) == 1) {
          mA = Z.valueOf(k);
          break;
        }
      }
    }
    return mA;
  }
}
