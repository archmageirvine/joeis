package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155675 Decimal expansion of log_8 (21).
 * @author Sean A. Irvine
 */
public class A155675 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155675() {
    super(CR.valueOf(21).log().divide(CR.EIGHT.log()));
  }
}
