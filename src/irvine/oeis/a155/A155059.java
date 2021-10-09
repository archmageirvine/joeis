package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155059 Decimal expansion of log_7(19).
 * @author Sean A. Irvine
 */
public class A155059 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155059() {
    super(CR.valueOf(19).log().divide(CR.SEVEN.log()));
  }
}
