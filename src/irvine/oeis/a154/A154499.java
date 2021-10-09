package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154499 Decimal expansion of log_21 (14).
 * @author Sean A. Irvine
 */
public class A154499 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154499() {
    super(CR.valueOf(14).log().divide(CR.valueOf(21).log()));
  }
}
