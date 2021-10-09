package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155680 Decimal expansion of log_13 (21).
 * @author Sean A. Irvine
 */
public class A155680 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155680() {
    super(CR.valueOf(21).log().divide(CR.valueOf(13).log()));
  }
}
