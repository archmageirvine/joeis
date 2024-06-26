package irvine.oeis.a056;

import irvine.oeis.PartialSumSequence;

/**
 * A056764 Number of integers k not exceeding 2^n such that the cube of number of divisors [A000005(k)] is larger than k.
 * @author Sean A. Irvine
 */
public class A056764 extends PartialSumSequence {

  /** Construct the sequence. */
  public A056764() {
    super(1, new A056763());
  }
}
