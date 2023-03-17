package irvine.oeis.a062;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062591 Primes of form 6n!+1.
 * @author Georg Fischer
 */
public class A062591 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z result = MemoryFactorial.SINGLETON.factorial(mN).multiply(6).add(1);
      if (result.isProbablePrime()) {
        return result;
      }
    }
  }
}
