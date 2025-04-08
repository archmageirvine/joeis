package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076518 Numbers n such that Fibonacci(n) == sigma(n) (mod n).
 * @author Sean A. Irvine
 */
public class A076518 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Fibonacci.fibonacci(++mN, mN) == Functions.SIGMA1.z(mN).mod(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
