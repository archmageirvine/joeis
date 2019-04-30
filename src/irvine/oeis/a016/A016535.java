package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016535 Continued fraction for <code>log(15/2)</code>.
 * @author Sean A. Irvine
 */
public class A016535 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016535() {
    super(new A016584());
  }
}
