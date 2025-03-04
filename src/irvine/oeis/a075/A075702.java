package irvine.oeis.a075;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A075698.
 * @author Sean A. Irvine
 */
public class A075702 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Fibonacci.fibonacci(Z.valueOf(++mN), p).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
