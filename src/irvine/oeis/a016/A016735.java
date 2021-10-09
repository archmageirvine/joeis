package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016735 Continued fraction for log(7).
 * @author Sean A. Irvine
 */
public class A016735 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016735() {
    super(new A016630());
  }
}
