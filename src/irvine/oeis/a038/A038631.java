package irvine.oeis.a038;

import irvine.oeis.cons.ContinuedFractionSequence;
import irvine.oeis.a065.A065442;

/**
 * A038631 Continued fraction expansion of Sum_{k&gt;=1} 1/(2^k - 1).
 * @author Sean A. Irvine
 */
public class A038631 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A038631() {
    super(new A065442());
  }
}
