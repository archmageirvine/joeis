package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016568 Continued fraction for log(81/2).
 * @author Sean A. Irvine
 */
public class A016568 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016568() {
    super(new A016617());
  }
}
