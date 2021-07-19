package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154803 Decimal expansion of log_13 (16).
 * @author Sean A. Irvine
 */
public class A154803 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154803() {
    super(CR.valueOf(16).log().divide(CR.valueOf(13).log()));
  }
}
