package irvine.oeis.a070;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A070913 Continued fraction expansion for BesselI(0,2).
 * @author Sean A. Irvine
 */
public class A070913 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A070913() {
    super(0, new A070910());
  }
}
