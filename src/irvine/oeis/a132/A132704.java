package irvine.oeis.a132;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A132704 Decimal expansion of 14/Pi.
 * @author Sean A. Irvine
 */
public class A132704 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A132704() {
    super(CR.valueOf(14).divide(CR.PI));
  }
}
