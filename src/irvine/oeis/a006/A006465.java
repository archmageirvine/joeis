package irvine.oeis.a006;

import irvine.oeis.ContinuedFractionSequence;
import irvine.oeis.a160.A160387;

/**
 * A006465 Continued fraction for <code>4^5*Sum_{n&gt;=0} 1/4^(2^n)</code>.
 * @author Sean A. Irvine
 */
public class A006465 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A006465() {
    super(new A160387());
  }
}
