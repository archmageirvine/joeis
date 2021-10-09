package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154814 Decimal expansion of log_14 (16).
 * @author Sean A. Irvine
 */
public class A154814 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154814() {
    super(CR.valueOf(16).log().divide(CR.valueOf(14).log()));
  }
}
