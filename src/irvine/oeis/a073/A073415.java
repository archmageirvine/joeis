package irvine.oeis.a073;

import irvine.oeis.a007.A007404;
import irvine.oeis.cons.ContinuedFractionDenominatorSequence;

/**
 * A073415 Denominator of the n-th convergent to Sum_{k&gt;=0} 1/2^(2^k).
 * @author Sean A. Irvine
 */
public class A073415 extends ContinuedFractionDenominatorSequence {

  /** Construct the sequence. */
  public A073415() {
    super(1, new A007404());
  }
}
