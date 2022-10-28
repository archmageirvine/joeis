package irvine.oeis.a054;

import irvine.oeis.FilterPositionSequence;

/**
 * A054997 Integers that can be expressed as the sum of consecutive primes in exactly 2 ways.
 * @author Sean A. Irvine
 */
public class A054997 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A054997() {
    super(0, new A054845(), 2);
  }
}

