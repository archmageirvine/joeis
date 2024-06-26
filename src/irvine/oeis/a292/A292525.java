package irvine.oeis.a292;
// Generated by gen_seq4.pl 2024-06-07/decexp at 2024-06-09 22:55

import irvine.oeis.a217.A217572;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A292525 Decimal expansion of the length of a parsec in meters, as defined in 2015.
 * @author Georg Fischer
 */
public class A292525 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A292525() {
    super(17, new A217572().getCR().multiply(149597870700L));
  }
}
