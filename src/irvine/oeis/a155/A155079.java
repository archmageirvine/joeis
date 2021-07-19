package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155079 Decimal expansion of log_16 (19).
 * @author Sean A. Irvine
 */
public class A155079 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155079() {
    super(CR.valueOf(19).log().divide(CR.valueOf(16).log()));
  }
}
