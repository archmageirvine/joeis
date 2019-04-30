package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016542 Continued fraction for <code>log(29/2)</code>.
 * @author Sean A. Irvine
 */
public class A016542 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016542() {
    super(new A016591());
  }
}
