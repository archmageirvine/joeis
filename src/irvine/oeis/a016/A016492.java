package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016492 Continued fraction for log(64).
 * @author Sean A. Irvine
 */
public class A016492 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016492() {
    super(new A016687());
  }
}
