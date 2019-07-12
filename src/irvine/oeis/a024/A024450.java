package irvine.oeis.a024;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a001.A001248;

/**
 * A024450 Sum of squares of the first n primes.
 * @author Sean A. Irvine
 */
public class A024450 extends PartialSumSequence {

  /** Construct the sequence. */
  public A024450() {
    super(new A001248());
  }
}
