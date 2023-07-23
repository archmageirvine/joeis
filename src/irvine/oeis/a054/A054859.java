package irvine.oeis.a054;

import irvine.oeis.InverseSequence;

/**
 * A054859 Smallest positive integer that can be expressed as the sum of consecutive primes in exactly n ways.
 * @author Sean A. Irvine
 */
public class A054859 extends InverseSequence {

  /** Construct the sequence. */
  public A054859() {
    super(0, new A054845().skip(1), 0, 1);
  }
}
