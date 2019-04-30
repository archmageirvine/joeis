package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016734 Continued fraction for <code>log(6)</code>.
 * @author Sean A. Irvine
 */
public class A016734 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016734() {
    super(new A016629());
  }
}
