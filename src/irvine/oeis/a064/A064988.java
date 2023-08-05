package irvine.oeis.a064;

import irvine.oeis.MultiplicativeSequence;
import irvine.oeis.a008.A008578;
import irvine.oeis.memory.MemorySequence;

/**
 * A064988 Multiplicative with a(p^e) = prime(p)^e.
 * @author Sean A. Irvine
 */
public class A064988 extends MultiplicativeSequence {

  private static final MemorySequence PRIMES = MemorySequence.cachedSequence(new A008578());

  /** Construct the sequence. */
  public A064988() {
    super(1, (p, e) -> PRIMES.a(p.intValueExact()).pow(e));
  }
}
