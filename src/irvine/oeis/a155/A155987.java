package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155987 Decimal expansion of log_15 (24).
 * @author Sean A. Irvine
 */
public class A155987 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155987() {
    super(CR.valueOf(24).log().divide(CR.valueOf(15).log()));
  }
}
