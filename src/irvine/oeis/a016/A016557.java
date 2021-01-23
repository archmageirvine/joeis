package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016557 Continued fraction for log(59/2).
 * @author Sean A. Irvine
 */
public class A016557 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016557() {
    super(new A016606());
  }
}
