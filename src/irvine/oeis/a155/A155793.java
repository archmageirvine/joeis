package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155793 Decimal expansion of log_2 (23).
 * @author Sean A. Irvine
 */
public class A155793 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155793() {
    super(CR.valueOf(23).log().divide(CR.TWO.log()));
  }
}
