package irvine.oeis.a231;

import irvine.oeis.DistinctMultiplicativeClosureSequence;
import irvine.oeis.a002.A002144;

/**
 * A231754 Products of distinct primes congruent to 1 modulo 4 (A002144).
 * @author Sean A. Irvine
 */
public class A231754 extends DistinctMultiplicativeClosureSequence {

  /** Construct the sequence. */
  public A231754() {
    super(new A002144());
  }
}
