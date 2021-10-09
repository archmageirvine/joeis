package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154839 Decimal expansion of log_21 (16).
 * @author Sean A. Irvine
 */
public class A154839 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154839() {
    super(CR.valueOf(16).log().divide(CR.valueOf(21).log()));
  }
}
