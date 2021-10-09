package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016571 Continued fraction for log(87/2).
 * @author Sean A. Irvine
 */
public class A016571 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016571() {
    super(new A016620());
  }
}
