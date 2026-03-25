package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A084295 n is such that pi(n*prime(n))/n is an integer.
 * @author Sean A. Irvine
 */
public class A084295 extends A000720 {

  private long mN = 0;
  private long mM = 0;
  private long mP = 1;
  private Z mA = null;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mP = Functions.NEXT_PRIME.l(mP);
      final long t = mP * mN;
      while (mM < t) {
        mA = super.next();
        ++mM;
      }
      if (mA.mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
