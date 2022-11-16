package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a003.A003266;

/**
 * A059709 a(n)-th Fibonorial number (product of first a(n) nonzero Fibonacci numbers) - 1 is prime.
 * @author Sean A. Irvine
 */
public class A059709 extends A003266 {

  private long mN = 0;
  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().subtract(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
