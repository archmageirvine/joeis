package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000301 <code>a(n) = a(n-1)*a(n-2)</code> with <code>a(0) = 1, a(1) = 2</code>; also <code>a(n) = 2^Fibonacci(n)</code>.
 * @author Sean A. Irvine
 */
public class A000301 extends A000045 {

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(super.next().intValue());
  }

}

