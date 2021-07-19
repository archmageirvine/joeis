package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155523 Decimal expansion of log_11 (20).
 * @author Sean A. Irvine
 */
public class A155523 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155523() {
    super(CR.valueOf(20).log().divide(CR.valueOf(11).log()));
  }
}
