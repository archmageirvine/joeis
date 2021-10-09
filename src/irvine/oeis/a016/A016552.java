package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016552 Continued fraction for log(49/2).
 * @author Sean A. Irvine
 */
public class A016552 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016552() {
    super(new A016601());
  }
}
