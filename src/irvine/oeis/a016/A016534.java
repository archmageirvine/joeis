package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016534 Continued fraction for log(13/2).
 * @author Sean A. Irvine
 */
public class A016534 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016534() {
    super(new A016583());
  }
}
