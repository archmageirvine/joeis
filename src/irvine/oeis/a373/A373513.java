package irvine.oeis.a373;
// Generated by gen_seq4.pl 2024-08-04/decexp at 2024-08-04 18:23

import irvine.oeis.a197.A197070;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A373513 Decimal expansion of 3*zeta(3)/2.
 * Formula:
 * @author Georg Fischer
 */
public class A373513 extends DecimalExpansionSequence {

  private static final DecimalExpansionSequence A197070 = new A197070();

  /** Construct the sequence */
  public A373513() {
    super(1, A197070.getCR().multiply(2));
  }
}
