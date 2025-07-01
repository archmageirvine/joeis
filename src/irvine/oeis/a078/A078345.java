package irvine.oeis.a078;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078345 Numbers k such that F(k) mod k divides F(F(k) mod k) where F(k) denotes the k-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A078345 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final long f = Fibonacci.fibonacci(mN, mN);
      if (f == 0 || Fibonacci.fibonacci(f, f) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

