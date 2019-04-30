package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016492 Continued fraction for <code>log(64)</code>.
 * @author Sean A. Irvine
 */
public class A016492 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016492() {
    super(new A016687());
  }
}
