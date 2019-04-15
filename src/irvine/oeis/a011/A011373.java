package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A011373 Number of 1's in binary expansion of <code>Fibonacci(n)</code>.
 * @author Sean A. Irvine
 */
public class A011373 extends A000045 {

  @Override
  public Z next() {
    return Z.valueOf(super.next().bitCount());
  }
}
