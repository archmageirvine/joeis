package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016561 Continued fraction for log(67/2).
 * @author Sean A. Irvine
 */
public class A016561 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016561() {
    super(new A016610());
  }
}
