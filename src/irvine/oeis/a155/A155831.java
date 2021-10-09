package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155831 Decimal expansion of log_11 (23).
 * @author Sean A. Irvine
 */
public class A155831 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155831() {
    super(CR.valueOf(23).log().divide(CR.valueOf(11).log()));
  }
}
