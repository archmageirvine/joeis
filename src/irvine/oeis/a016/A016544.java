package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016544 Continued fraction for log(33/2).
 * @author Sean A. Irvine
 */
public class A016544 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016544() {
    super(new A016593());
  }
}
