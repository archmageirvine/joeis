package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155979 Decimal expansion of log_10 (24).
 * @author Sean A. Irvine
 */
public class A155979 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155979() {
    super(CR.valueOf(24).log().divide(CR.LOG10));
  }
}
