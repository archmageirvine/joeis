package irvine.oeis.a174;
// Generated by gen_seq4.pl dexcr CR.SQRT2.multiply(REALS.pow(CR.E, CR.GAMMA)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A174815 Decimal expansion of sqrt(2)*e^(gamma), where gamma is Euler's constant.
 * @author Georg Fischer
 */
public class A174815 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A174815() {
    super(CR.SQRT2.multiply(REALS.pow(CR.E, CR.GAMMA)));
  }
}
