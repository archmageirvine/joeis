package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A004699 a(n) = floor(Fibonacci(n)/6).
 * @author Sean A. Irvine
 */
public class A004699 extends A000045 {

  @Override
  public Z next() {
    return super.next().divide(6);
  }
}

