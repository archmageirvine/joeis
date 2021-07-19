package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020859 Decimal expansion of log_2(6).
 * @author Sean A. Irvine
 */
public class A020859 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020859() {
    super(CR.SIX.log().divide(CR.TWO.log()));
  }
}
