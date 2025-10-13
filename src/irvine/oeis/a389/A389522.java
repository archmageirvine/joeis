package irvine.oeis.a389;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A389522 allocated for Daniel Hoyt.
 * @author Sean A. Irvine
 */
public class A389522 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A389522() {
    super(0, new A389527());
  }
}
