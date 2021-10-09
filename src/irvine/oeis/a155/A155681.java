package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155681 Decimal expansion of log_14 (21).
 * @author Sean A. Irvine
 */
public class A155681 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155681() {
    super(CR.valueOf(21).log().divide(CR.valueOf(14).log()));
  }
}
