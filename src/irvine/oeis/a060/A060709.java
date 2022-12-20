package irvine.oeis.a060;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A060709 Continued fraction expansion of the Reuleaux Triangle constant.
 * @author Sean A. Irvine
 */
public class A060709 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A060709() {
    super(new A060708());
  }
}
