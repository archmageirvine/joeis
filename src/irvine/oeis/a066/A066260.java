package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.oeis.MultiplicativeSequence;
import irvine.oeis.a018.A018252;
import irvine.oeis.memory.MemorySequence;

/**
 * A066260 In the prime factorization of n replace the k-th prime with the k-th composite number, k &gt; 0.
 * @author Sean A. Irvine
 */
public class A066260 extends MultiplicativeSequence {

  private static final MemorySequence COMPOSITES = MemorySequence.cachedSequence(new A018252());

  /** Construct the sequence. */
  public A066260() {
    super(1, (p, e) -> COMPOSITES.a((int) Functions.PRIME_PI.l(p)).pow(e));
  }
}
