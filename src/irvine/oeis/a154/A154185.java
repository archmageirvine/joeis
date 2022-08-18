package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154185 Decimal expansion of log_14 (11).
 * @author Sean A. Irvine
 */
public class A154185 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154185() {
    super(0, CR.valueOf(11).log().divide(CR.valueOf(14).log()));
  }
}
