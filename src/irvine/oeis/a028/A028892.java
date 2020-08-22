package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;
import irvine.oeis.a016.A016116;

/**
 * A028892 a(n) = Fibonacci(n) - 2^(floor(n/2)).
 * @author Sean A. Irvine
 */
public class A028892 extends A000045 {

  private final A016116 mA = new A016116();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
