package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.oeis.a141.A141251;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389492 Decimal expansion of the maximum y value of y=x^(x^-y) and y=x^(-x/y).
 * @author Sean A. Irvine
 */
public class A389492 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389492() {
    super(1, new A141251().getCR().divide(CR.E));
  }
}

