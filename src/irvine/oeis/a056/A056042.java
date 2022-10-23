package irvine.oeis.a056;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056042 a(n) = n!/(k!)^2, where k is the largest number such that (k!)^2 divides n!.
 * @author Sean A. Irvine
 */
public class A056042 extends Sequence1 {

  private int mN = 0;
  private int mK = 1;

  @Override
  public Z next() {
    final Z f = MemoryFactorial.SINGLETON.factorial(++mN);
    while (f.mod(MemoryFactorial.SINGLETON.factorial(mK).square()).isZero()) {
      ++mK;
    }
    return MemoryFactorial.SINGLETON.factorial(mN).divide(MemoryFactorial.SINGLETON.factorial(mK - 1).square());
  }
}
