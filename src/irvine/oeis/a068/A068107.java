package irvine.oeis.a068;

import irvine.math.Mobius;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068092.
 * @author Sean A. Irvine
 */
public class A068107 extends Sequence1 {

  private static final MemoryFactorial F = MemoryFactorial.SINGLETON;
  private int mN = 0;

  @Override
  public Z next() {
    final Z fn = F.factorial(++mN);
    return Integers.SINGLETON.sum(1, mN, k -> fn.divide(F.factorial(k)).multiply(Mobius.mobius(k)));
  }
}

