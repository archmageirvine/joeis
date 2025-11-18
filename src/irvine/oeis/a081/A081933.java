package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081933 a(1) = 1, a(n) is the smallest number coprime to n and beginning with a(n-1).
 * @author Sean A. Irvine
 */
public class A081933 extends Sequence1 {

  private Z mA = null;
  private long mN = 1;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    ++mN;
    Z t = mA;
    long lim = 1;
    while (true) {
      t = t.multiply(10);
      lim *= 10;
      for (long k = 0; k < lim; ++k) {
        final Z u = t.add(k);
        if (Functions.GCD.z(mN, u).isOne()) {
          mA = u;
          return mA;
        }
      }
    }
  }
}
