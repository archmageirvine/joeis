package irvine.oeis.a258;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A258428 Decimal expansion of arctan(1/e).
 * @author Georg Fischer
 */
public class A258428 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A258428() {
    super(0, REALS.atan(CR.ONE.divide(CR.E)));
  }
}
