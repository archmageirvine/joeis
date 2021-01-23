package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000301 a(n) = a(n-1)*a(n-2) with a(0) = 1, a(1) = 2; also a(n) = 2^Fibonacci(n).
 * @author Sean A. Irvine
 */
public class A000301 extends A000045 {

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(super.next().intValue());
  }

}

