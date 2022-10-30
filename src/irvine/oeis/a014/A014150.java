package irvine.oeis.a014;

import irvine.oeis.PartialSumSequence;

/**
 * A014150 Apply partial sum operator thrice to primes.
 * @author Sean A. Irvine
 */
public class A014150 extends PartialSumSequence {

  /** Construct the sequence. */
  public A014150() {
    super(1, new A014148());
  }
}
