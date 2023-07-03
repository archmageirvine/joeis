package irvine.oeis.a002;

import irvine.oeis.a160.A160332;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A002937 An exotic continued fraction (for the real root of x^3 - 8*x - 10).
 * @author Sean A. Irvine
 */
public class A002937 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A002937() {
    super(0, new A160332());
  }
}
