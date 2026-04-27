package irvine.oeis.a395;

import irvine.oeis.a088.A088559;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395138 Decimal expansion of the absolute value of the real part of the complex roots of x^3 - x^2 - 1 = 0.
 * @author Sean A. Irvine
 */
public class A395138 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A395138() {
    super(0, new A088559().getCR().divide(2));
  }
}
