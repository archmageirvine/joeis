package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016487 Continued fraction for log(59).
 * @author Sean A. Irvine
 */
public class A016487 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016487() {
    super(new A016682());
  }
}
