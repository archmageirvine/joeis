package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155829 Decimal expansion of log_9 (23).
 * @author Sean A. Irvine
 */
public class A155829 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155829() {
    super(CR.valueOf(23).log().divide(CR.NINE.log()));
  }
}
