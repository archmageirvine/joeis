package irvine.oeis.a054;

import irvine.oeis.FilterPositionSequence;

/**
 * A054998 Integers that can be expressed as the sum of consecutive primes in exactly 3 ways.
 * @author Sean A. Irvine
 */
public class A054998 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A054998() {
    super(0, new A054845(), 3);
  }
}

