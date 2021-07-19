package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155534 Decimal expansion of log_23 (20).
 * @author Sean A. Irvine
 */
public class A155534 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155534() {
    super(CR.valueOf(20).log().divide(CR.valueOf(23).log()));
  }
}
