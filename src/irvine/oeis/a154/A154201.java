package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154201 Decimal expansion of log_8 (12).
 * @author Sean A. Irvine
 */
public class A154201 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154201() {
    super(CR.valueOf(12).log().divide(CR.EIGHT.log()));
  }
}
