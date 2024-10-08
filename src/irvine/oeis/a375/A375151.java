package irvine.oeis.a375;
// Generated by gen_seq4.pl 2024-08-04/decexp at 2024-08-04 18:23

import irvine.oeis.a121.A121602;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A375151 Decimal expansion of the circumradius of a regular 9-gon with unit side length.
 * Formula:
 * @author Georg Fischer
 */
public class A375151 extends DecimalExpansionSequence {

  private static final DecimalExpansionSequence A121602 = new A121602();

  /** Construct the sequence */
  public A375151() {
    super(1, A121602.getCR().divide(2));
  }
}
