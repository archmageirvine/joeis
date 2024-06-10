package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A070301 Numbers n such that sum of first 2n primes is prime.
 * @author Sean A. Irvine
 */
public class A070301 extends A000040 {

  private long mN = 0;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mSum = mSum.add(super.next()).add(super.next());
      if (mSum.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
