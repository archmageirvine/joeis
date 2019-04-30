package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016444 Continued fraction for <code>log(16)</code>.
 * @author Sean A. Irvine
 */
public class A016444 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016444() {
    super(new A016639());
  }
}
