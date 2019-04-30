package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016552 Continued fraction for <code>log(49/2)</code>.
 * @author Sean A. Irvine
 */
public class A016552 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016552() {
    super(new A016601());
  }
}
