package irvine.oeis.a121;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A121389 a(n) = 10^Fibonacci(n) - 1.
 * @author Georg Fischer
 */
public class A121389 extends A000045 {

  @Override
  public Z next() {
    return Z.TEN.pow(super.next()).subtract(1);
  }
}
