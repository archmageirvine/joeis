package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154211 Decimal expansion of log_19 (12).
 * @author Sean A. Irvine
 */
public class A154211 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154211() {
    super(CR.valueOf(12).log().divide(CR.valueOf(19).log()));
  }
}
