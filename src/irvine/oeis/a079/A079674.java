package irvine.oeis.a079;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A079674 Continued fraction expansion of Product_{k&gt;=1} (1 + 1/2^k) = 2.384231029031371...
 * @author Sean A. Irvine
 */
public class A079674 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A079674() {
    super(0, new A079555());
  }
}

