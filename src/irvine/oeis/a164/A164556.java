package irvine.oeis.a164;

import irvine.oeis.a000.A000040;
import irvine.oeis.a067.A067380;
import irvine.oeis.memory.MemorySequence;

/**
 * A164556 Primes expressible as the sum of (at least two) consecutive primes in at least 5 ways.
 * @author Sean A. Irvine
 */
public class A164556 extends A067380 {

  /** Construct the sequence. */
  public A164556() {
    super(1, MemorySequence.cachedSequence(new A000040()), 5);
  }
}

