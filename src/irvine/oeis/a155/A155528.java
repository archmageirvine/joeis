package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155528 Decimal expansion of log_16 (20).
 * @author Sean A. Irvine
 */
public class A155528 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155528() {
    super(CR.valueOf(20).log().divide(CR.valueOf(16).log()));
  }
}
