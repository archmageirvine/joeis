package irvine.oeis.a197;
// Generated by gen_seq4.pl dex CR.TAU.divide(CR.TWO.add(CR.PI)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A197727 Decimal expansion of 2*Pi/(2+Pi).
 * @author Georg Fischer
 */
public class A197727 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A197727() {
    super(CR.TAU.divide(CR.TWO.add(CR.PI)));
  }
}
