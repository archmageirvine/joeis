package irvine.oeis.a094;
// Generated by gen_seq4.pl dexcr CR.PI.add(REALS.atan(REALS.pow(CR.E, CR.PI))) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A094078 Decimal expansion of Pi + arctan(e^Pi).
 * @author Georg Fischer
 */
public class A094078 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A094078() {
    super(CR.PI.add(REALS.atan(REALS.pow(CR.E, CR.PI))));
  }
}
