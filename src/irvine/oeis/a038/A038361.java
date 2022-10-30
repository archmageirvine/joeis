package irvine.oeis.a038;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a007.A007528;

/**
 * A038361 Partial sums of primes congruent to 5 mod 6.
 * @author Sean A. Irvine
 */
public class A038361 extends PartialSumSequence {

  /** Construct the sequence. */
  public A038361() {
    super(1, new A007528());
  }
}
