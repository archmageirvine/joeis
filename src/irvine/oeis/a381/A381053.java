package irvine.oeis.a381;

import irvine.math.function.Functions;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A381053 Integers k such that Fibonacci(k) is odd and divides the sum of the first Fibonacci(k) nonzero Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A381053 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z mod = Functions.FIBONACCI.z(mN);
      if (mod.isOdd()) {
        final Z t = Fibonacci.fibonacci(mod.add(2), mod);
        if (Z.ONE.mod(mod).equals(t)) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
