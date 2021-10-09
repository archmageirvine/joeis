package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016564 Continued fraction for log(73/2).
 * @author Sean A. Irvine
 */
public class A016564 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016564() {
    super(new A016613());
  }
}
