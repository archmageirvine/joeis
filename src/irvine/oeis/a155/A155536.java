package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155536 Decimal expansion of log_2 (21).
 * @author Sean A. Irvine
 */
public class A155536 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155536() {
    super(CR.valueOf(21).log().divide(CR.TWO.log()));
  }
}
