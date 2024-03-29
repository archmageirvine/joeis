package irvine.oeis.a074;
// Generated by gen_seq4.pl decexp at 2021-07-18 19:09

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A074958 Decimal expansion of the arithmetic-geometric mean (AGM) of 2 and 3.
 * Formula: agm(2, 3)
 * @author Georg Fischer
 */
public class A074958 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A074958() {
    super(1, CR.TWO.agm(CR.THREE));
  }
}
