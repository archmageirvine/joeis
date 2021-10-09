package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016445 Continued fraction for log(17).
 * @author Sean A. Irvine
 */
public class A016445 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016445() {
    super(new A016640());
  }
}
