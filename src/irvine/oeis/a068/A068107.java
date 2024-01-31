package irvine.oeis.a068;

import irvine.math.Mobius;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068107 a(n) = n!*Sum_{k=1..n} mu(k)/k!, where mu(k) is the Moebius function.
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

