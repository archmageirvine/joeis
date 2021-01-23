package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A014238 a(n) = (n-th number that is 1 or prime) - (n-th composite number).
 * @author Sean A. Irvine
 */
public class A014238 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    if (mN == 0) {
      mN = 4;
      return Z.valueOf(-3);
    }
    if (mFast.isPrime(++mN)) {
      ++mN;
    }
    return super.next().subtract(mN);
  }
}
