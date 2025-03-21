package irvine.oeis.a105;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A105531 Decimal expansion of arctan(1/3).
 * @author Georg Fischer
 */
public class A105531 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A105531() {
    super(0, REALS.atan(CR.ONE_THIRD));
  }
}
