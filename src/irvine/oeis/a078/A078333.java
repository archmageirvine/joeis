package irvine.oeis.a078;
// Generated by gen_seq4.pl dexcr REALS.pow(CR.SQRT2, CR.SQRT2) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A078333 Decimal expansion of sqrt(2)^sqrt(2).
 * @author Georg Fischer
 */
public class A078333 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A078333() {
    super(REALS.pow(CR.SQRT2, CR.SQRT2));
  }
}
