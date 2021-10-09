package irvine.oeis.a132;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A132717 Decimal expansion of 27/Pi.
 * @author Sean A. Irvine
 */
public class A132717 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A132717() {
    super(CR.valueOf(27).divide(CR.PI));
  }
}
