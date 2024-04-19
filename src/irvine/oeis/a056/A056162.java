package irvine.oeis.a056;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A056162 a(n) = Sum_{k=0..n} (k!)^(n-k).
 * @author Georg Fischer
 */
public class A056162 extends Sequence0 {

  private int mN = -1;
  private static final MemoryFactorial FACTORIAL = MemoryFactorial.SINGLETON;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(0, mN, k -> {
      return Functions.FACTORIAL.z(k).pow(mN - k);
    });
  }
}
