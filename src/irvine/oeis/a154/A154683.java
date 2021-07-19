package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154683 Decimal expansion of log_17 (15).
 * @author Sean A. Irvine
 */
public class A154683 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154683() {
    super(CR.valueOf(15).log().divide(CR.valueOf(17).log()));
  }
}
