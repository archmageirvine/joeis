package irvine.oeis.a068;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A068092.
 * @author Sean A. Irvine
 */
public class A068100 extends CachedSequence {

  private static final MemoryFactorial F = MemoryFactorial.SINGLETON;

  /** Construct the sequence. */
  public A068100() {
    super(1, Integer.class, (self, n) -> n == 1
      ? Z.ONE
      : Integers.SINGLETON.sumdiv(n - 1, d -> self.a(d).multiply(F.factorial(n - 1).divide(F.factorial(d)))));
  }
}

