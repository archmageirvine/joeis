package irvine.oeis.a054;

import irvine.oeis.FilterPositionSequence;

/**
 * A054996 Integers that can be expressed as the sum of consecutive primes in exactly 1 way.
 * @author Sean A. Irvine
 */
public class A054996 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A054996() {
    super(0, new A054845(), 1);
  }
}

