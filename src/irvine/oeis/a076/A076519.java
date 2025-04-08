package irvine.oeis.a076;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A076519 Numbers n such that Fibonacci(n) == prime(n) (mod n).
 * @author Sean A. Irvine
 */
public class A076519 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Fibonacci.fibonacci(++mN, mN) == super.next().mod(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
