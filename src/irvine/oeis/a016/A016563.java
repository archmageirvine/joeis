package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016563 Continued fraction for log(71/2).
 * @author Sean A. Irvine
 */
public class A016563 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016563() {
    super(new A016612());
  }
}
