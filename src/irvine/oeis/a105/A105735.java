package irvine.oeis.a105;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A105735 Decimal expansion of arcsin(1/e).
 * @author Georg Fischer
 */
public class A105735 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A105735() {
    super(0, REALS.asin(CR.ONE.divide(CR.E)));
  }
}
