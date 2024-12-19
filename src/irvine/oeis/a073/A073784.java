package irvine.oeis.a073;

import irvine.oeis.DifferenceSequence;

/**
 * A073784 Number of primes between successive composite numbers.
 * @author Sean A. Irvine
 */
public class A073784 extends DifferenceSequence {

  /** Construct the sequence. */
  public A073784() {
    super(1, new A073425().skip());
  }
}
