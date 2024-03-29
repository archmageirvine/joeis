package irvine.oeis.a244;
// Generated by gen_seq4.pl decexp at 2021-07-12 23:03

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A244334 Decimal expansion of 64/169, the upper bound (as given by S. Finch) of the 2-dimensional simultaneous Diophantine approximation constant.
 * @author Georg Fischer
 */
public class A244334 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A244334() {
    super(0, CR.valueOf(64).divide(CR.valueOf(169)));
  }
}
