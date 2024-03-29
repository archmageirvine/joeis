package irvine.oeis.a117;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A117040 Decimal expansion of (cos 1)^(1/5).
 * @author Georg Fischer
 */
public class A117040 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A117040() {
    super(0, REALS.pow(CR.ONE.cos(), CR.ONE.divide(CR.FIVE)));
  }
}
