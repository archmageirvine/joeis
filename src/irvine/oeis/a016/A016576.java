package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016576 Continued fraction for <code>log(97/2)</code>.
 * @author Sean A. Irvine
 */
public class A016576 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016576() {
    super(new A016625());
  }
}
