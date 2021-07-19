package irvine.oeis.a088;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A088538 Decimal expansion of 4/Pi.
 * @author Sean A. Irvine
 */
public class A088538 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A088538() {
    super(CR.FOUR.divide(CR.PI));
  }
}
