package irvine.oeis.a117;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A117034 Decimal expansion of (cos 1)^3.
 * @author Georg Fischer
 */
public class A117034 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A117034() {
    super(0, REALS.pow(CR.ONE.cos(), CR.THREE));
  }
}
