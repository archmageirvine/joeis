package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A008346 a(n) = Fibonacci(n) + (-1)^n.
 * @author Sean A. Irvine
 */
public class A008346 extends A000045 {

  private long mN = -1;

  @Override
  public Z next() {
    return super.next().signedAdd((++mN & 1) == 0, Z.ONE);
  }
}


