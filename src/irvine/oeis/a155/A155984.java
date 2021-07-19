package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155984 Decimal expansion of log_14 (24).
 * @author Sean A. Irvine
 */
public class A155984 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155984() {
    super(CR.valueOf(24).log().divide(CR.valueOf(14).log()));
  }
}
