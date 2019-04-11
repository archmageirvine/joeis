package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A004698 <code>a(n) =</code> floor(Fibonacci(n)/5).
 * @author Sean A. Irvine
 */
public class A004698 extends A000045 {

  @Override
  public Z next() {
    return super.next().divide(5);
  }
}

