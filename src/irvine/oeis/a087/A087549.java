package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A087549 a(1) = 1, a(2) = 1, a(n) = sum of tau(n) previous terms, where tau(n) is the number of divisors of n.
 * @author Sean A. Irvine
 */
public class A087549 extends CachedSequence {

  /** Construct the sequence. */
  public A087549() {
    super(1, Long.class, (self, n) -> n <= 2 ? Z.ONE : Integers.SINGLETON.sum(n - Functions.SIGMA0.l(n), n - 1, self::a));
  }
}

