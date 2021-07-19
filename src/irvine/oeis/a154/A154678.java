package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154678 Decimal expansion of log_16 (15).
 * @author Sean A. Irvine
 */
public class A154678 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154678() {
    super(CR.valueOf(15).log().divide(CR.valueOf(16).log()));
  }
}
