package irvine.oeis.a034;

import irvine.oeis.MemorySequence;
import irvine.oeis.a000.A000040;

/**
 * A034707 Numbers that are sums (of a nonempty sequence) of consecutive primes.
 * @author Sean A. Irvine
 */
public class A034707 extends A034706 {

  /** Construct the sequence. */
  public A034707() {
    super(1, MemorySequence.cachedSequence(new A000040()));
  }
}

