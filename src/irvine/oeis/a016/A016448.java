package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016448 Continued fraction for <code>log(20)</code>.
 * @author Sean A. Irvine
 */
public class A016448 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016448() {
    super(new A016643());
  }
}
