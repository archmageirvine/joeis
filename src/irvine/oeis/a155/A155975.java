package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155975 Decimal expansion of log_8 (24).
 * @author Sean A. Irvine
 */
public class A155975 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155975() {
    super(CR.valueOf(24).log().divide(CR.EIGHT.log()));
  }
}
