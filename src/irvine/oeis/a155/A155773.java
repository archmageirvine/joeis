package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155773 Decimal expansion of log_14 (22).
 * @author Sean A. Irvine
 */
public class A155773 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155773() {
    super(CR.valueOf(22).log().divide(CR.valueOf(14).log()));
  }
}
