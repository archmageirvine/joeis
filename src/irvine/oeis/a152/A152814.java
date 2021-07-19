package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A152814 Decimal expansion of log_19 (2).
 * @author Sean A. Irvine
 */
public class A152814 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A152814() {
    super(CR.TWO.log().divide(CR.valueOf(19).log()));
  }
}
