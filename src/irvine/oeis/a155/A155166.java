package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155166 Decimal expansion of log_23 (19).
 * @author Sean A. Irvine
 */
public class A155166 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155166() {
    super(CR.valueOf(19).log().divide(CR.valueOf(23).log()));
  }
}
