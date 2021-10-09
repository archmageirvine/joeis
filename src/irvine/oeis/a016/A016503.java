package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016503 Continued fraction for log(75).
 * @author Sean A. Irvine
 */
public class A016503 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016503() {
    super(new A016698());
  }
}
