package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154396 Decimal expansion of log_14 (13).
 * @author Sean A. Irvine
 */
public class A154396 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154396() {
    super(CR.valueOf(13).log().divide(CR.valueOf(14).log()));
  }
}
