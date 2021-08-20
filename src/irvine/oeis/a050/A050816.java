package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A050816 Fibonacci(k) ending with digits of its index number k.
 * @author Sean A. Irvine
 */
public class A050816 extends A000045 {

  private long mN = -1;
  private long mLim = 1;

  @Override
  public Z next() {
    while (true) {
      if (++mN == mLim) {
        mLim *= 10;
      }
      final Z f = super.next();
      if (f.mod(mLim) == mN) {
        return f;
      }
    }
  }
}
