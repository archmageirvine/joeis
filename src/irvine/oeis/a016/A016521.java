package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016521 Continued fraction for log(93).
 * @author Sean A. Irvine
 */
public class A016521 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016521() {
    super(new A016716());
  }
}
