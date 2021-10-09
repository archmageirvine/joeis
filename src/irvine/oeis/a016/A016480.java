package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016480 Continued fraction for log(52).
 * @author Sean A. Irvine
 */
public class A016480 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016480() {
    super(new A016675());
  }
}
