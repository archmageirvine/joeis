package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016499 Continued fraction for log(71).
 * @author Sean A. Irvine
 */
public class A016499 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016499() {
    super(new A016694());
  }
}
