package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016536 Continued fraction for log(17/2).
 * @author Sean A. Irvine
 */
public class A016536 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016536() {
    super(new A016585());
  }
}
