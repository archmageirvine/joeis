package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016733 Continued fraction for <code>log(5)</code>.
 * @author Sean A. Irvine
 */
public class A016733 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016733() {
    super(new A016628());
  }
}
