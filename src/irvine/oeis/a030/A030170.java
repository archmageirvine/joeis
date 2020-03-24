package irvine.oeis.a030;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A030170.
 * @author Sean A. Irvine
 */
public class A030170 extends ContinuedFractionSequence {

  // todo This is stupidly slow because underlying lnGamma is very slow

  /** Construct the sequence. */
  public A030170() {
    super(new A030169());
  }
}
