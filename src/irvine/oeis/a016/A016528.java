package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016528 Continued fraction for log(100).
 * @author Sean A. Irvine
 */
public class A016528 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016528() {
    super(new A016723());
  }
}
