package irvine.oeis.a369;
// Generated by gen_seq4.pl 2025-03-23.ack/decexp at 2025-03-23 22:08

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A369883 Decimal expansion of Integral_{x=0..1} x/(1 - log(x)) dx.
 * Formula: - e^2*Ei(-2), where Ei(x)
 * @author Georg Fischer
 */
public class A369883 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A369883() {
    super(0, CR.E.square().multiply(CrFunctions.EI.cr(CR.valueOf(-2))).negate());
  }
}
