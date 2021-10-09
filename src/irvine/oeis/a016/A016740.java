package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016740 Continued fraction for log(12).
 * @author Sean A. Irvine
 */
public class A016740 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016740() {
    super(new A016635());
  }
}
