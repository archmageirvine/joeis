package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016526 Continued fraction for <code>log(98)</code>.
 * @author Sean A. Irvine
 */
public class A016526 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016526() {
    super(new A016721());
  }
}
