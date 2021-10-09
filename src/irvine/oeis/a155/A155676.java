package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155676 Decimal expansion of log_9 (21).
 * @author Sean A. Irvine
 */
public class A155676 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155676() {
    super(CR.valueOf(21).log().divide(CR.NINE.log()));
  }
}
