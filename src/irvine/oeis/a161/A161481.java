package irvine.oeis.a161;
// Generated by gen_seq4.pl dexcr CR.valueOf(16131).add(CR.valueOf(6970).multiply(CR.SQRT2)).divide(REALS.pow(CR.valueOf(113), CR.TWO)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A161481 Decimal expansion of (16131 + 6970*sqrt(2))/113^2.
 * @author Georg Fischer
 */
public class A161481 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A161481() {
    super(CR.valueOf(16131).add(CR.valueOf(6970).multiply(CR.SQRT2)).divide(REALS.pow(CR.valueOf(113), CR.TWO)));
  }
}
