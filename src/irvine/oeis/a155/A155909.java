package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155909 Decimal expansion of log_21 (23).
 * @author Sean A. Irvine
 */
public class A155909 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155909() {
    super(CR.valueOf(23).log().divide(CR.valueOf(21).log()));
  }
}
