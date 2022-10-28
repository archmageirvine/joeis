package irvine.oeis.a054;

import irvine.oeis.FilterPositionSequence;

/**
 * A054999 Integers that can be expressed as the sum of consecutive primes in exactly 4 ways.
 * @author Sean A. Irvine
 */
public class A054999 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A054999() {
    super(0, new A054845(), 4);
  }
}

