package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016577 Continued fraction for log(99/2).
 * @author Sean A. Irvine
 */
public class A016577 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016577() {
    super(new A016626());
  }
}
