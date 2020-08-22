package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A004697 a(n) = floor(Fibonacci(n)/4).
 * @author Sean A. Irvine
 */
public class A004697 extends A000045 {

  @Override
  public Z next() {
    return super.next().divide(4);
  }
}

