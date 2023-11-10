package irvine.oeis.a066;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A066717 The continued fraction for the "binary" Champernowne constant.
 * @author Sean A. Irvine
 */
public class A066717 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A066717() {
    super(0, new A066716());
  }
}
