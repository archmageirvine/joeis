package irvine.oeis.a347;
// Generated by gen_seq4.pl 2025-02-06.ack/decexp at 2025-02-06 23:16

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A347909 Decimal expansion of Integral_{x=0..1} exp(-x^2) dx.
 * Formula:
 * @author Georg Fischer
 */
public class A347909 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A347909() {
    super(0, CR.PI.sqrt().divide(CR.TWO).multiply(CrFunctions.ERF.cr(CR.ONE)));
  }
}
