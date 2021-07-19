package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155525 Decimal expansion of log_13 (20).
 * @author Sean A. Irvine
 */
public class A155525 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155525() {
    super(CR.valueOf(20).log().divide(CR.valueOf(13).log()));
  }
}
