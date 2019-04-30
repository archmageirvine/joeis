package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016503 Continued fraction for <code>log(75)</code>.
 * @author Sean A. Irvine
 */
public class A016503 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016503() {
    super(new A016698());
  }
}
