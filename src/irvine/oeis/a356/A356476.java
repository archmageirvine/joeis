package irvine.oeis.a356;
// Generated by gen_seq4.pl 2024-06-06/decexp at 2024-06-06 20:10

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A356476 Decimal expansion of Loschmidt constant in m^-3 (273.15 K, 100 kPa).
 * Formula:
 * @author Georg Fischer
 */
public class A356476 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A356476() {
    super(26, CR.TEN.pow(35).multiply(CR.TWO).divide(CR.valueOf(7542485487L)));
  }
}
