package irvine.oeis.a072;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072378 Numbers n such that 12*n divides F(12*n), where F(m) is the m-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A072378 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long t = ++mN * 12;
      if (Fibonacci.fibonacci(t, t) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
