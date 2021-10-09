package irvine.oeis.a132;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A132713 Decimal expansion of 23/Pi.
 * @author Sean A. Irvine
 */
public class A132713 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A132713() {
    super(CR.valueOf(23).divide(CR.PI));
  }
}
