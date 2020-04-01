package irvine.oeis.a030;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A030427.
 * @author Sean A. Irvine
 */
public class A030427 extends A000040 {

  private int mN = 0;
  private long mPrimeNumber = 0;
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    final long f = Fibonacci.fibonacci(++mN).longValueExact();
    while (mPrimeNumber < f) {
      mP = super.next();
      ++mPrimeNumber;
    }
    return mP;
  }
}

