package irvine.oeis.a062;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062698 Primes of form 2n!+1.
 * @author Georg Fischer
 */
public class A062698 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z result = MemoryFactorial.SINGLETON.factorial(mN).multiply(2).add(1);
      if (result.isProbablePrime()) {
        return result;
      }
    }
  }
}
