package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155907 Decimal expansion of log_20 (23).
 * @author Sean A. Irvine
 */
public class A155907 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155907() {
    super(CR.valueOf(23).log().divide(CR.valueOf(20).log()));
  }
}
