package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016442 Continued fraction for <code>log(14)</code>.
 * @author Sean A. Irvine
 */
public class A016442 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016442() {
    super(new A016637());
  }
}
