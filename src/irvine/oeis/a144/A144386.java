package irvine.oeis.a144;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000040;

/**
 * A144386 a(0)=0, a(1)=1, if a(n-1) - prime(n) &gt; 0, then a(n) = a(n-1) - 2*n, if a(n-1) - prime(n) &lt; 0, then a(n) = a(n-1) + 2*n, otherwise a(n) = Fibonacci(n) - a(n-1).
 * @author Sean A. Irvine
 */
public class A144386 extends Sequence0 {

  private final Sequence mPrimes = new A000040().skip();
  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ZERO;
    }
    if (mN == 1) {
      return Z.ONE;
    }
    final Z p = mPrimes.next();
    final int sign = mA.subtract(p).signum();
    if (sign > 0) {
      mA = mA.subtract(2 * mN);
    } else if (sign < 0) {
      mA = mA.add(2 * mN);
    } else {
      mA = Functions.FIBONACCI.z(mN).subtract(mA);
    }
    return mA;
  }
}
