package irvine.oeis.a371;
// Generated by gen_seq4.pl 2024-06-06/decexp at 2024-06-06 20:10

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A371857 Decimal expansion of Integral_{x=0..oo} exp(-x^7) dx.
 * Formula:
 * @author Georg Fischer
 */
public class A371857 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A371857() {
    super(0, CrFunctions.GAMMA.cr(CR.ONE.divide(CR.SEVEN)).divide(7));
  }
}
