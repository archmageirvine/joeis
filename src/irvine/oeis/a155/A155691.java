package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155691 Decimal expansion of log_23 (21).
 * @author Sean A. Irvine
 */
public class A155691 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155691() {
    super(CR.valueOf(21).log().divide(CR.valueOf(23).log()));
  }
}
