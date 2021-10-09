package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154216 Decimal expansion of log_24(12).
 * @author Sean A. Irvine
 */
public class A154216 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154216() {
    super(CR.valueOf(12).log().divide(CR.valueOf(24).log()));
  }
}
