package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155920 Decimal expansion of log_24 (23).
 * @author Sean A. Irvine
 */
public class A155920 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155920() {
    super(0, CR.valueOf(23).log().divide(CR.valueOf(24).log()));
  }
}
