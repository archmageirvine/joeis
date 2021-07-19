package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155526 Decimal expansion of log_14 (20).
 * @author Sean A. Irvine
 */
public class A155526 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155526() {
    super(CR.valueOf(20).log().divide(CR.valueOf(14).log()));
  }
}
