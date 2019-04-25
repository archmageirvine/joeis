package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A008963 Initial digit of Fibonacci number <code>F(n)</code>.
 * @author Sean A. Irvine
 */
public class A008963 extends A000045 {

  @Override
  public Z next() {
    return Z.valueOf(super.next().toString().charAt(0) - '0');
  }
}
