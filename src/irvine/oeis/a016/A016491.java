package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016491 Continued fraction for log(63).
 * @author Sean A. Irvine
 */
public class A016491 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016491() {
    super(new A016686());
  }
}
