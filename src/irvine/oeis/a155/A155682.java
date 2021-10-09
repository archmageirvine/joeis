package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155682 Decimal expansion of log_15 (21).
 * @author Sean A. Irvine
 */
public class A155682 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155682() {
    super(CR.valueOf(21).log().divide(CR.valueOf(15).log()));
  }
}
