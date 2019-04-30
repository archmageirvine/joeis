package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016506 Continued fraction for <code>log(78)</code>.
 * @author Sean A. Irvine
 */
public class A016506 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016506() {
    super(new A016701());
  }
}
