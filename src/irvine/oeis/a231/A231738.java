package irvine.oeis.a231;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A231738 Decimal expansion of (1/Pi)^(1/e).
 * @author Georg Fischer
 */
public class A231738 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A231738() {
    super(0, REALS.pow(CR.ONE.divide(CR.PI), CR.ONE.divide(CR.E)));
  }
}
