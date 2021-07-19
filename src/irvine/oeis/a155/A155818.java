package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155818 Decimal expansion of log_4 (23).
 * @author Sean A. Irvine
 */
public class A155818 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155818() {
    super(CR.valueOf(23).log().divide(CR.FOUR.log()));
  }
}
