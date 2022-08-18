package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A152683 Decimal expansion of log_6 (2).
 * @author Sean A. Irvine
 */
public class A152683 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A152683() {
    super(0, CR.TWO.log().divide(CR.SIX.log()));
  }
}
