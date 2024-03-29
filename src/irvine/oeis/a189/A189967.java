package irvine.oeis.a189;
// Generated by gen_seq4.pl decexp at 2021-07-12 23:03

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A189967 Decimal expansion of (7+sqrt(105))/4, which has periodic continued fractions [4,3,4,1,4,3,4,1...] and [7/2, 1, 7/2, 1, ...].
 * @author Georg Fischer
 */
public class A189967 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A189967() {
    super(1, CR.SEVEN.add(CR.valueOf(105).sqrt()).divide(CR.FOUR));
  }
}
