package irvine.oeis.a074;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A074952 Continued fraction for sqrt((Pi^2 + e^2)/2).
 * @author Sean A. Irvine
 */
public class A074952 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A074952() {
    super(0, new A074948());
  }
}
