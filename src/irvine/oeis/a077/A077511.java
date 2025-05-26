package irvine.oeis.a077;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A077511 Continued fraction expansion of lim n -&gt; infinity A001699(n)^(1/2^n).
 * @author Sean A. Irvine
 */
public class A077511 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A077511() {
    super(0, new A077496());
  }
}

