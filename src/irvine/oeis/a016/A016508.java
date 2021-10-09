package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016508 Continued fraction for log(80).
 * @author Sean A. Irvine
 */
public class A016508 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016508() {
    super(new A016703());
  }
}
