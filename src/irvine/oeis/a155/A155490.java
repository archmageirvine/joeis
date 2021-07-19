package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155490 Decimal expansion of log_6 (20).
 * @author Sean A. Irvine
 */
public class A155490 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155490() {
    super(CR.valueOf(20).log().divide(CR.SIX.log()));
  }
}
