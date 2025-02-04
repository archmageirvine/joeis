package irvine.oeis.a074;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A074961 Continued fraction for arithmetic-geometric mean (AGM) of first two primes 2 and 3.
 * @author Sean A. Irvine
 */
public class A074961 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A074961() {
    super(0, new A074958());
  }
}
