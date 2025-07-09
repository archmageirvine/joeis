package irvine.oeis.a078;

import irvine.oeis.InverseSequence;

/**
 * A078647 Smallest integer that can be written in exactly n ways as the sum of two primes that are congruent modulo 3.
 * @author Sean A. Irvine
 */
public class A078647 extends InverseSequence {

  /** Construct the sequence. */
  public A078647() {
    super(1, new A078646());
  }
}
