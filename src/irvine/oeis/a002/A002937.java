package irvine.oeis.a002;

import irvine.oeis.ContinuedFractionSequence;
import irvine.oeis.a160.A160332;

/**
 * A002937 An exotic continued fraction (for the real root of <code>x^3 - 8*x - 10)</code>.
 * @author Sean A. Irvine
 */
public class A002937 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A002937() {
    super(new A160332());
  }
}
