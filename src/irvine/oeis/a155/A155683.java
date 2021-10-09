package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155683 Decimal expansion of log_16 (21).
 * @author Sean A. Irvine
 */
public class A155683 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155683() {
    super(CR.valueOf(21).log().divide(CR.valueOf(16).log()));
  }
}
