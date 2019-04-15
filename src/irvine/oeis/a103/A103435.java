package irvine.oeis.a103;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A103435 <code>a(n) = 2^n * Fibonacci(n)</code>.
 * @author Sean A. Irvine
 */
public class A103435 extends A000045 {

  private int mN = -1;

  @Override
  public Z next() {
    return super.next().shiftLeft(++mN);
  }
}

