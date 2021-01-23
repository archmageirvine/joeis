package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016567 Continued fraction for log(79/2).
 * @author Sean A. Irvine
 */
public class A016567 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016567() {
    super(new A016616());
  }
}
