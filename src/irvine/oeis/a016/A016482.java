package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016482 Continued fraction for log(54).
 * @author Sean A. Irvine
 */
public class A016482 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016482() {
    super(new A016677());
  }
}
